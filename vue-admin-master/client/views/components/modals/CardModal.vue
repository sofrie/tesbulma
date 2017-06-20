<template>
  <card-modal :visible="visible" @close="close" :title="title" transition="zoom">
    <div class="content has-text-centered"></div>
    <a @click="open(url)">Vue Admin on GitHub</a>
  </card-modal>
</template>

<script>
import { CardModal } from 'vue-bulma-modal'

export default {
  components: {
    CardModal
  },

  props: {
    visible: Boolean,
    title: String,
    url: String
  },

  data () {
    return {
      src: require('assets/logo.svg')
    }
  },

  methods: {
    open (url) {
      window.open(url)
    },

    close () {
      this.$emit('close')
    }
  }
}
</script>
