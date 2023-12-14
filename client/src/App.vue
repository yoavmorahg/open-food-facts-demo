<template>
  <div id="app">
      <search-box />
      <search-results v-show="!detailSelected"/>
      <product-detail v-show="detailSelected"/>
  </div>
</template>

<script>
import ProductDetail from './components/ProductDetail.vue'
import SearchBox from './components/SearchBox.vue'
import SearchResults from './components/SearchResults.vue'

export default {
  name: 'App',
  components: {
    SearchBox,
    SearchResults,
    ProductDetail
  },
  computed: {
    detailSelected() {
      return this.$store.state.productDetail.product_name != undefined;
    } 
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

.hidden {
  display: none;
}
</style>
