<template>
  <div id="app">
    <router-view></router-view>

              <button @click="showModalSimple = true">Simple</button>
              <button @click="showModalFull = true">Full</button>
	<simple-dialog :showModal="showModalSimple" :closeAction="closeDialog"></simple-dialog>
    <full-dialog :showModal="showModalFull" :closeAction="closeDialog" :clickAction="clickAction"></full-dialog>
  </div>
</template>

<script>
import SimpleDialog from './SimpleDialog.vue'
import FullDialog from './FullDialog.vue'
export default {
  name: 'App',
  components: { SimpleDialog, FullDialog },
  data () {
    return {
      section: 'Head',
      showModal: false,
      showModalSimple: false,
      showModalFull: false
    }
  },
  methods: {
    logout () {
      this.$store.commit('SET_USER', null)
      this.$store.commit('SET_TOKEN', null)

      if (window.localStorage) {
        window.localStorage.setItem('user', null)
        window.localStorage.setItem('token', null)
      }

      this.$router.push('/login')
    },
    closeDialog () {
      this.showModalSimple = false
      this.showModalFull = false
    },
    clickAction () {
      this.showModalSimple = false
      this.showModalFull = false
    }
  }
}
</script>
