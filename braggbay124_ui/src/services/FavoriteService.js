import http from "../http-common"; 

class FavoriteService {
  getAllFavorites(searchDTO) {
    console.log(searchDTO)
    return this.getRequest(`/favorite/favorites`, searchDTO);
  }

  get(favoriteId) {
    return this.getRequest(`/favorite/${favoriteId}`, null);
  }

  findByField(matchData) {
    return this.getRequest(`/favorite?field=${matchData}`, null);
  }

  addFavorite(data) {
    return http.post("/favorite/addFavorite", data);
  }

  update(data) {
  	return http.post("/favorite/updateFavorite", data);
  }
  
  uploadImage(data,favoriteId) {
  	return http.postForm("/favorite/uploadImage/"+favoriteId, data);
  }




	postRequest(url, data) {
		return http.post(url, data);
      };

	getRequest(url, params) {
        return http.get(url, {
        	params: params
        });
    };

}

export default new FavoriteService();
