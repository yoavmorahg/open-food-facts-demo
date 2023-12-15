import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

import axios from 'axios'

export default new Vuex.Store({
  state: {
    searchTerm: '',
    searching: false,
    searchResults: {},
    productDetail: {},
    curPage: 0
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
    },
    UPDATE_PAGE_NUM(state, newPageNum) {
      state.curPage = newPageNum;
    },
  },
  actions: {
    SEARCH_ACTION({commit, state}) {
        commit('UPDATE_SEARCH_RESULTS', []);
        commit('UPDATE_PAGE_NUM', 0);
        commit('UPDATE_DETAIL', {});
        commit('UPDATE_SEARCH_STATE', true);
        const server = 'https://open-food-facts-demo.fly.dev';
        // const server = 'http://localhost:8080';
        const url = `${server}/search?searchTerm=${state.searchTerm}`;
        axios.get(url).then( resp => {
          commit('UPDATE_SEARCH_RESULTS', resp.data);
          commit('UPDATE_PAGE_NUM', 1);
          commit('UPDATE_SEARCH_STATE', false);
        });
    },
    NEXT_PAGE_ACTION({ state, dispatch }) {
      if (state.curPage < state.searchResults.page_count) {
        state.curPage++;
        dispatch('GET_PAGE_ACTION');
      }
    },
    PREV_PAGE_ACTION({ state, dispatch }) {
      if (state.curPage > 1) {
        state.curPage--;
        dispatch('GET_PAGE_ACTION');
      }
    },
    GET_PAGE_ACTION({ commit, state }) {
      commit('UPDATE_SEARCH_RESULTS', []);
        commit('UPDATE_DETAIL', {});
        commit('UPDATE_SEARCH_STATE', true);
        const server = 'https://open-food-facts-demo.fly.dev'
        const url = `${server}/search?searchTerm=${state.searchTerm}&pageNum=${state.curPage}`;
        axios.get(url).then( resp => {
          commit('UPDATE_SEARCH_RESULTS', resp.data);
          commit('UPDATE_SEARCH_STATE', false);
        });
    }
  },
  modules: {
  }
})
