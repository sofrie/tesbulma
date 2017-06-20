import Vue from 'vue'

export default {
  get () {
    return Vue.http.get(`https://api.github.com/users/sofrie`)
  }
  // etc
}
