<template>
    <div >
      <div class="product-detail-container">
          <div class="product-detail">
  
              <div class="product-name">
                  {{ product.name   }}
              </div>
  
              <div class="nutrition-info">
                  
                  <div >
                      Serving size: {{ product.serving_size_g ? product.serving_size_g : '' }}
                  </div>
                  <div >
                      Calories: {{ product.calories ? parseInt(product.calories) : '' }}
                  </div>
                  <div >
                      Fat: {{ product.fat_total_g ? parseInt(product.fat_total_g) + ' g' : '' }}
                  </div>
                  <div >
                      Carbohydrates: {{ product.carbohydrates_total_g ? product.carbohydrates_total_g + ' g' : '' }}
                  </div>
                  <div >
                      Protein: {{ product.protein_g ? product.protein_g + ' g' : '' }}
                  </div>
              </div>
  
              <div class="close-btn">
                  <button @click="close">Close</button>
              </div>
          </div>
      </div>
    </div>
  </template>
  
  <script>
  export default {
      name: 'ninja-product-detail',
      computed: {
          product() {
              return this.$store.state.productDetail;
          }
      },
      methods: {
          close() {
              this.$store.commit('UPDATE_DETAIL', {});
          }
      }
  }
  </script>
  
  <style scoped>
  
  .product-detail-container{
  }
  
  .product-detail {
      width: 100%;
  
      display: flex;
      flex-direction: column;
      align-items: center;
  
  }
  
  .product-name {
      width: 60%;
      background-color:lightyellow;
      font-weight: bolder;
  }
  
  .nutrition-info {
      width: 60%;
      background-color:lightgray;
  }
  
  .product-name, .nutrition-info {
      border: 1px solid black;
  }
  
  .close-btn {
      margin-top: 10px;
  }
  </style>