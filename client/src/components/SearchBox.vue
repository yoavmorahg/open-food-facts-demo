<template>
  <div>
        <div class="search-container">
            <form>
                <label for="search-term">Type something to search for: </label>
                <input id="search-term" type="text" v-model="searchTermText" />
                <input class="btn" type="submit" @click.prevent="doSearch" :disabled="searching">
                <button class="btn"  @click="clear" :disabled="searching">Clear</button>
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