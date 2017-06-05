<template>
  <card-modal :visible="visible" @close="close" :title="title" transition="zoom" class="classmodalleft">
    <div class="tile is-parent">
      <article class="tile is-child box ">

        <!--<h1 class="title">Upload Invoice</h1>-->

        <div class="block ">
          <table class="tablemodal" >
            <tr>
              <td>Month</td>

              <td>
              <span class="select">
                <select>
                  <option>January</option>
                  <option>Februari</option>
                </select>
              </span>
              </td>
            </tr>
            <tr>
              <td>Year </td>
              <td>
              <span class="select">
                <select>
                  <option>2017</option>
                </select>
              </span>
              </td>
            </tr>
            <tr>
              <td>Logistic </td>
              <td>
              <span class="select">
                <select>
                  <option>A Logistic</option>
                  <option>B Logistic</option>
                  <option>C Logistic</option>
                </select>
              </span>
              </td>
            </tr>
            <tr>
              <td>File</td>
              <td>
                <input type="file" name="datafile" size="40">
              </td>
            </tr>
            <tr>
            </tr>
            <tr>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td colspan="2" class="centerbutton">
                <button class="button is-info ">Submit Upload</button>
              </td>
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
    height: 70%;
  }
  .modal-card-foot {
    visibility: hidden;
  }
  .tablemodal {
    margin-left: 27%;
    width: 80%;
  }
  .centerbutton {
    padding-left: 10%;
  }
</style>
