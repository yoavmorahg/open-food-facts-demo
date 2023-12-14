<template>
  <div>
        <div class="search-container">
            <form>
                <label for="search-term">Type something to search for: </label>
                <input id="search-term" type="text" v-model="searchTermText" />
                <input type="submit" @click.prevent="doSearch"/>
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
    methods: {
        doSearch() {
            this.$store.commit('UPDATE_SEARCH_TERM', this.searchTermText);
            this.$store.dispatch('SEARCH_ACTION');
        }
    }


}
</script>

<style>

</style>