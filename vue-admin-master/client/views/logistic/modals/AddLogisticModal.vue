<template>
  <card-modal :visible="visible" @close="close" :title="title" transition="zoom" class="classmodalleft">
    <div class="tile is-parent">
      <article class="tile is-child ">

        <!--<h1 class="title">Upload Invoice</h1>-->

        <div class="block ">
          <table class="tablemodal" >
            <tr>
              <td>Logistic Name</td>

              <td>
              <input class="input" type="text" placeholder="Name">
              </td>
            </tr>
            <tr>
              <td>Status </td>
              <td>
              <span class="select">
                <select>
                  <option>Active</option>
                  <option>Inactive</option>
                </select>
              </span>
              </td>
            </tr>
            <tr>
              <td>Discount </td>
              <td>
              <input class="input" type="text" placeholder="Discount %">
              </td>
            </tr>
            <tr>
              <td>VAT</td>
              <td>
                <input class="input" type="text" placeholder="VAT %">
              </td>
            </tr>
            <tr>
              <td>&nbsp;</td>
            </tr>
          </table>
        </div>
      </article>
    </div>
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
<style>
  .classmodal{
  }
  .classmodalleft {

  }
  .modal-card {
    width: 35%;
    height: 50%;
  }
  .tablemodal {
    margin-left: 10%;
    width: 80%;
  }
  .centerbutton {
    padding-left: 40%;
  }
</style>
