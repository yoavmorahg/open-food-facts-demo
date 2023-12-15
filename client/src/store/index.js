import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

import axios from 'axios'

export default new Vuex.Store({
  state: {
    searchTerm: '',
    searching: false,
    searchResults: [],
    productDetail: {}
  },
  mutations: {
    UPDATE_SEARCH_TERM(state, newTerm) {
      state.searchTerm = newTerm;
    },
    UPDATE_SEARCH_STATE(state, searching) {
      state.searching = searching;
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
        commit('UPDATE_SEARCH_RESULTS', []);
        commit('UPDATE_DETAIL', {});
        commit('UPDATE_SEARCH_STATE', true);
        const url = `https://open-food-facts-demo-misty-firefly-3326.fly.dev/search?searchTerm=${state.searchTerm}`;
        axios.get(url).then( resp => {
          commit('UPDATE_SEARCH_RESULTS', resp.data);
          commit('UPDATE_SEARCH_STATE', false);
        });
    }
  },
  modules: {
  }
})
