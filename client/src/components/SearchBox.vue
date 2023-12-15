<template>
  <div>
        <div class="search-container">
            <form>
                <label for="search-term">Type a food to search for: </label>
                <input  id="search-term" type="text" v-model="searchTermText" @keyup.enter="doSearch" :disabled="disabledInput"/>
                <input class="btn" type="submit" @click.prevent="doSearch" :disabled="disabledInput">
                <button class="btn"  @click="clear" :disabled="disabledInput">Clear</button>
            </form>
        </div>
  </div>
</template>

<script>
export default {
    name: 'search-box',
    data() {
        return {
            searchTermText: ''
        }
    },
    computed: {
        searching() {
            return this.$store.state.searching;
        },
        disabledInput() {
            return this.searching || this.$store.state.productDetail.product_name != undefined;
        }
    },
    methods: {
        doSearch() {
            this.$store.commit('UPDATE_SEARCH_TERM', this.searchTermText);
            this.$store.dispatch('SEARCH_ACTION');
        },
        clear() {
            this.$store.commit('UPDATE_SEARCH_TERM', this.searchTermText);
            this.$store.commit('UPDATE_SEARCH_RESULTS', []);
        }
    }


}
</script>

<style scoped>

.btn {
    margin-left: 3px;
}



</style>