<template>
    <div>
      <div class="search-results">
          <div class="results-container">
              <div class="result-count" v-show="curPage > 0">
                  Total Results: {{ resultData.count != undefined ? resultData.count : 'N/A' }}
              </div>
          </div>
      </div>
    </div>
  </template>
  
  <script>
  export default {
      name: 'results-count',
      computed: {
          resultData() {
              return this.$store.state.searchResults ? this.$store.state.searchResults : {} ;
          },
          curPage() {
              return this.$store.state.curPage;
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