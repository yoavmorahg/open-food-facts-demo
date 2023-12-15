<template>
  <div >
    <div class="product-detail-container">
        <div class="product-detail">

            <div class="product-name">
                {{ product.product_name   }}
            </div>

            <div class="nutrition-info" v-if="product.nutriments">
                
                <div >
                    Serving size: {{ product.serving_size ? product.serving_size : '' }}
                </div>
                <div >
                    Calories: {{ product.nutriments.calories ? parseInt(product.nutriments.calories) : '' }}
                </div>
                <div >
                    Fat: {{ product.nutriments.fat ? parseInt(product.nutriments.fat) + ' g' : '' }}
                </div>
                <div >
                    Carbohydrates: {{ product.nutriments.carbohydrates ? parseInt(product.nutriments.carbohydrates) + ' g' : '' }}
                </div>
                <div >
                    Proteins: {{ product.nutriments.proteins ? parseInt(product.nutriments.proteins)  + ' g' : '' }}
                </div>
                <div >
                    Sugars: {{ product.nutriments.sugars ? parseInt(product.nutriments.sugars)  + ' g' : ''}}
                </div>
                <div >
                    Sodium: {{ product.nutriments.sodium_value ? parseInt(product.nutriments.sodium_value) + ' mg' : '' }}
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
    name: 'product-detail',
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