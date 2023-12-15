<template>
  <div>
    <div class="pager-container">
   
        <button @click="prevPage" :disabled="pageNum <= 1">&lt;</button> {{  pageNum }} of {{ maxPages }} <button @click="nextPage" :disabled="pageNum >= maxPages">&gt;</button> 

    </div>
  </div>
</template>

<script>
export default {
    name: 'pager',
    computed: {
        pageNum() {
            return this.$store.state.curPage;
        },
        maxPagesOld() {
            if (this.$store.state.searchResults.page_count) {
                const pageCount = this.$store.state.searchResults.page_count;
                return this.results.count <= this.$store.state.searchResults.page_size ?  1 : pageCount;
            }
            return 0;
        },
        maxPages() {
            const count = this.$store.state.searchResults.count;
            if (this.count < 1) {
                return 0;
            }
            let maxVal = count / this.$store.state.searchResults.page_size;
            let max = parseInt(maxVal);
            if (maxVal % 1 != 0) {
                max++;
            }
            return max;
        },
        results() {
            return this.$store.state.searchResults;
        }
    },
    methods: {
        nextPage() {
            this.$store.dispatch('NEXT_PAGE_ACTION');
        },
        prevPage() {
            this.$store.dispatch('PREV_PAGE_ACTION');
        }
    }
}

</script>

<style>

</style>