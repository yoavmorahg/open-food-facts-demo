import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

import axios from 'axios'

export default new Vuex.Store({
  state: {
    searchTerm: '',
    searchResults: [],
    productDetail: {}
  },
  mutations: {
    UPDATE_SEARCH_TERM(state, newTerm) {
      state.searchTerm = newTerm;
    },
    UPDATE_SEARCH_RESULTS(state, results) {
      state.searchResults = results;
    },
    UPDATE_DETAIL(state, product) {
      state.productDetail = product;
    }
  },
  actions: {
    SEARCH_ACTION({commit, state}) {
        const url = `http://localhost:8080/search/v2?searchTerm=${state.searchTerm}`;
        axios.get(url).then( resp => {
          commit('UPDATE_SEARCH_RESULTS', resp.data);
        });
    }
  },
  modules: {
  }
})
