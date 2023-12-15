<template>
  <div>
    <div class="search-results">
        <div class="results-container">
            <div v-for="(product, index) in results" :key="index" class="results-item" @click="updateCurrentProduct(product)">
                {{  product.product_name }}
            </div>
        </div>
    </div>
  </div>
</template>

<script>
export default {
    name: 'search-results',
    computed: {
        results() {
            return this.$store.state.searchResults.length != 0 ?this.$store.state.searchResults.products : [];
        },
        resultData() {
            return this.$store.state.searchResults ? this.$store.state.searchResults : {} ;
        },
        curPage() {
            return this.$store.state.curPage;
        }

    },
    methods: {
        updateCurrentProduct(product) {
            this.$store.commit('UPDATE_DETAIL', product);
        }
    }

}
</script>

<style scoped> 
.search-results {
        display: flex;
        justify-content: center;
 }

 .results-container {
    display: flex;
    flex-direction: column;
    align-items: flex-start;

    margin-top: 10px;
    
 }

 .results-item:hover {
    cursor: pointer;
    color: blue;
 }

 .result-count {
    margin-bottom: 10px;
 }



</style>