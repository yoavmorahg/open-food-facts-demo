<template>
  <div id="app">
      <search-box />
      <image-spinner class="spinner" v-show="searching" />
      <results-count />
      <pager v-show="!searching && !detailSelected && curPage > 0" />
      <search-results v-show="!searching && !detailSelected" />
      <product-detail class="detail-section" v-show="detailSelected"/>
  </div>
</template>

<script>
import ImageSpinner from './components/ImageSpinner.vue'
import ProductDetail from './components/ProductDetail.vue'
import SearchBox from './components/SearchBox.vue'
import SearchResults from './components/SearchResults.vue'

import Pager from './components/Pager.vue'
import ResultsCount from './components/ResultsCount.vue'

export default {
  name: 'App',
  components: {
    SearchBox,
    SearchResults,
    ProductDetail,
    ImageSpinner,
    Pager,
    ResultsCount
  },
  computed: {
    detailSelected() {
      return this.$store.state.productDetail.product_name != undefined;
    },
    searching() {
      return this.$store.state.searching;
    },
    curPage() {
      return this.$store.state.curPage;
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

.spinner {
  margin-top: 10px;
}

.detail-section {
  margin-top: 10px;
}

.hidden {
  display: none;
}
</style>
