<template>
  <div class="content">
    <div class="row">
      <div class="col-12">
        <card class="card-plain">
          <!-- <template slot="header">
            <h4 class="card-title">Table on Plain Background</h4>
            <p class="category">Here is a subtitle for this table</p>
          </template>-->
          <div class="table-full-width text-left">
            <favorite-table
            v-if="favorites && favorites.length > 0"
				:title="table1.title"
				:sub-title="table1.subTitle"
				:favorites="favorites"
				:totalElements="totalElements"
				:page="page"
				:columns="table1.columns"
 				@get-all-favorites="getAllFavorites"
             >

            </favorite-table>
          </div>
        </card>
      </div>

    </div>
  </div>
</template>
<script>
import { Card } from "@/components/Card";

import FavoriteTable from "@/components/FavoriteTable";
import FavoriteService from "../services/FavoriteService";

const tableColumns = [];
const tableData = [
];

export default {
  components: {
    Card,
    FavoriteTable,
  },
  data() {
    return {
      favorites: [],
	  totalElements: 0,
      page: 0,
      searchQuery: '',     
      table1: {
        title: "Simple Table",
        columns: [...tableColumns],
        data: [...tableData],
      },
    };
  },
  methods: {
    async getAllFavorites(sortBy='favoriteId',sortOrder='true',page="0",size="50") {
      try {
        try {
			const searchDTO = {
				sortBy: sortBy, 
				sortOrder: sortOrder, 
				searchQuery: this.searchQuery,
				page: page, 
				size: size
			};
	        let response = await FavoriteService.getAllFavorites(searchDTO);
	        if (!response.data.empty) {
		        if (response.data.favorites.length) {
					this.favorites = response.data.favorites;
				}
      			this.totalElements = response.data.totalElements;
      			this.page = response.data.page;
	        }
        } catch (error) {
          console.error("Error fetching favorites:", error);
        }
        
      } catch (error) {
        console.error("Error fetching favorite details:", error);
      }
    },
  },
  mounted() {
    this.getAllFavorites();
  },
  created() {
    this.$root.$on('searchQueryForFavoritesChanged', (searchQuery) => {
    	this.searchQuery = searchQuery;
    	this.getAllFavorites();
    })
  }
};
</script>
<style></style>
