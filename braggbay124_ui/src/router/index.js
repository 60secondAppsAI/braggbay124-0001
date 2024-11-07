import Vue from "vue";
import VueRouter from "vue-router";
import DefaultLayout from "@/layouts/DefaultLayout.vue";
import Users from  '@/pages/Users.vue';
import UserDetail from  '@/pages/UserDetail.vue';
import Items from  '@/pages/Items.vue';
import ItemDetail from  '@/pages/ItemDetail.vue';
import Bids from  '@/pages/Bids.vue';
import BidDetail from  '@/pages/BidDetail.vue';
import Categorys from  '@/pages/Categorys.vue';
import CategoryDetail from  '@/pages/CategoryDetail.vue';
import Feedbacks from  '@/pages/Feedbacks.vue';
import FeedbackDetail from  '@/pages/FeedbackDetail.vue';
import Addresss from  '@/pages/Addresss.vue';
import AddressDetail from  '@/pages/AddressDetail.vue';
import Orders from  '@/pages/Orders.vue';
import OrderDetail from  '@/pages/OrderDetail.vue';
import PaymentMethods from  '@/pages/PaymentMethods.vue';
import PaymentMethodDetail from  '@/pages/PaymentMethodDetail.vue';
import Messages from  '@/pages/Messages.vue';
import MessageDetail from  '@/pages/MessageDetail.vue';
import Watchlists from  '@/pages/Watchlists.vue';
import WatchlistDetail from  '@/pages/WatchlistDetail.vue';
import Auctions from  '@/pages/Auctions.vue';
import AuctionDetail from  '@/pages/AuctionDetail.vue';
import Reviews from  '@/pages/Reviews.vue';
import ReviewDetail from  '@/pages/ReviewDetail.vue';
import Invoices from  '@/pages/Invoices.vue';
import InvoiceDetail from  '@/pages/InvoiceDetail.vue';
import Shipments from  '@/pages/Shipments.vue';
import ShipmentDetail from  '@/pages/ShipmentDetail.vue';
import Sellers from  '@/pages/Sellers.vue';
import SellerDetail from  '@/pages/SellerDetail.vue';
import Buyers from  '@/pages/Buyers.vue';
import BuyerDetail from  '@/pages/BuyerDetail.vue';
import Notifications from  '@/pages/Notifications.vue';
import NotificationDetail from  '@/pages/NotificationDetail.vue';
import Carts from  '@/pages/Carts.vue';
import CartDetail from  '@/pages/CartDetail.vue';
import Favorites from  '@/pages/Favorites.vue';
import FavoriteDetail from  '@/pages/FavoriteDetail.vue';
import Transactions from  '@/pages/Transactions.vue';
import TransactionDetail from  '@/pages/TransactionDetail.vue';

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "home",
    component: () => import("../views/HomeView.vue"),
			redirect: '/users',
																				  },
  {
    path: "/pricing",
    name: "PricingView",
    component: () => import("../views/PricingView.vue"),
  },
  {
    path: "/arts-gallery",
    name: "ArtsGalleryView",
    component: () => import("../views/ArtsGalleryView.vue"),
  },
  {
    path: "/checkout/:id",
    name: "CheckoutView",
    component: () => import("../views/CheckoutView.vue"),
  },
  {
    path: "/stripe-checkout",
    name: "StripeCheckoutView",
    component: () => import("../views/StripeCheckoutView.vue"),
  },
	{
		path: '/users',
		name: 'Users',
		layout: DefaultLayout,
		component: Users,
	},
	{
	    path: '/user/:userId', 
	    name: 'UserDetail',
		layout: DefaultLayout,
	    component: UserDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/items',
		name: 'Items',
		layout: DefaultLayout,
		component: Items,
	},
	{
	    path: '/item/:itemId', 
	    name: 'ItemDetail',
		layout: DefaultLayout,
	    component: ItemDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/bids',
		name: 'Bids',
		layout: DefaultLayout,
		component: Bids,
	},
	{
	    path: '/bid/:bidId', 
	    name: 'BidDetail',
		layout: DefaultLayout,
	    component: BidDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/categorys',
		name: 'Categorys',
		layout: DefaultLayout,
		component: Categorys,
	},
	{
	    path: '/category/:categoryId', 
	    name: 'CategoryDetail',
		layout: DefaultLayout,
	    component: CategoryDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/feedbacks',
		name: 'Feedbacks',
		layout: DefaultLayout,
		component: Feedbacks,
	},
	{
	    path: '/feedback/:feedbackId', 
	    name: 'FeedbackDetail',
		layout: DefaultLayout,
	    component: FeedbackDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/addresss',
		name: 'Addresss',
		layout: DefaultLayout,
		component: Addresss,
	},
	{
	    path: '/address/:addressId', 
	    name: 'AddressDetail',
		layout: DefaultLayout,
	    component: AddressDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/orders',
		name: 'Orders',
		layout: DefaultLayout,
		component: Orders,
	},
	{
	    path: '/order/:orderId', 
	    name: 'OrderDetail',
		layout: DefaultLayout,
	    component: OrderDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/paymentMethods',
		name: 'PaymentMethods',
		layout: DefaultLayout,
		component: PaymentMethods,
	},
	{
	    path: '/paymentMethod/:paymentMethodId', 
	    name: 'PaymentMethodDetail',
		layout: DefaultLayout,
	    component: PaymentMethodDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/messages',
		name: 'Messages',
		layout: DefaultLayout,
		component: Messages,
	},
	{
	    path: '/message/:messageId', 
	    name: 'MessageDetail',
		layout: DefaultLayout,
	    component: MessageDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/watchlists',
		name: 'Watchlists',
		layout: DefaultLayout,
		component: Watchlists,
	},
	{
	    path: '/watchlist/:watchlistId', 
	    name: 'WatchlistDetail',
		layout: DefaultLayout,
	    component: WatchlistDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/auctions',
		name: 'Auctions',
		layout: DefaultLayout,
		component: Auctions,
	},
	{
	    path: '/auction/:auctionId', 
	    name: 'AuctionDetail',
		layout: DefaultLayout,
	    component: AuctionDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/reviews',
		name: 'Reviews',
		layout: DefaultLayout,
		component: Reviews,
	},
	{
	    path: '/review/:reviewId', 
	    name: 'ReviewDetail',
		layout: DefaultLayout,
	    component: ReviewDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/invoices',
		name: 'Invoices',
		layout: DefaultLayout,
		component: Invoices,
	},
	{
	    path: '/invoice/:invoiceId', 
	    name: 'InvoiceDetail',
		layout: DefaultLayout,
	    component: InvoiceDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/shipments',
		name: 'Shipments',
		layout: DefaultLayout,
		component: Shipments,
	},
	{
	    path: '/shipment/:shipmentId', 
	    name: 'ShipmentDetail',
		layout: DefaultLayout,
	    component: ShipmentDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/sellers',
		name: 'Sellers',
		layout: DefaultLayout,
		component: Sellers,
	},
	{
	    path: '/seller/:sellerId', 
	    name: 'SellerDetail',
		layout: DefaultLayout,
	    component: SellerDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/buyers',
		name: 'Buyers',
		layout: DefaultLayout,
		component: Buyers,
	},
	{
	    path: '/buyer/:buyerId', 
	    name: 'BuyerDetail',
		layout: DefaultLayout,
	    component: BuyerDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/notifications',
		name: 'Notifications',
		layout: DefaultLayout,
		component: Notifications,
	},
	{
	    path: '/notification/:notificationId', 
	    name: 'NotificationDetail',
		layout: DefaultLayout,
	    component: NotificationDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/carts',
		name: 'Carts',
		layout: DefaultLayout,
		component: Carts,
	},
	{
	    path: '/cart/:cartId', 
	    name: 'CartDetail',
		layout: DefaultLayout,
	    component: CartDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/favorites',
		name: 'Favorites',
		layout: DefaultLayout,
		component: Favorites,
	},
	{
	    path: '/favorite/:favoriteId', 
	    name: 'FavoriteDetail',
		layout: DefaultLayout,
	    component: FavoriteDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/transactions',
		name: 'Transactions',
		layout: DefaultLayout,
		component: Transactions,
	},
	{
	    path: '/transaction/:transactionId', 
	    name: 'TransactionDetail',
		layout: DefaultLayout,
	    component: TransactionDetail,
	    props: true // Pass route params as props to the component
  	},
];

const router = new VueRouter({
  mode: "hash",
  base: process.env.BASE_URL,
  routes,
});

export default router;
