<template>
  <div >
        <div>
            {{ product.product_name   }}

            <div class="nutrition-info" v-if="product.nutriments">
                <div >
                    Carbohydrates: {{ product.nutriments.carbohydrates ? parseInt(product.nutriments.carbohydrates) : '' }}
                </div>
                <div >
                    Fat: {{ product.nutriments.fat ? parseInt(product.nutriments.fat) : '' }}
                </div>
                <div >
                    Proteins: {{ product.nutriments.proteins ? parseInt(product.nutriments.proteins) : '' }}
                </div>
                <div >
                    Sugars: {{ product.nutriments.sugars ? parseInt(product.nutriments.sugars) : ''}}
                </div>
                <div >
                    Calories: {{ product.nutriments.calories ? parseInt(product.nutriments.calories) : '' }}
                </div>
                <div >
                    Sodium: {{ product.nutriments.sodium_value ? parseInt(product.nutriments.sodium_value) : '' }}
                </div>
            </div>

            <div class="close-btn">
                <button @click="close">Close</button>
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

<style>

</style>