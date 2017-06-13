<template>
<div>
  <card-modal :visible="visible" :title="title" transition="zoom" class="classmodalleft">
    <div class="tile is-parent">
      <article class="tile is-child ">
      <form>
        <!--<h1 class="title">Upload Invoice</h1>-->
        <div class="block ">
          <table class="tablemodal" >
            <tr>
              <td>Logistic Name</td>

              <td>
              <input ref="idname" class="input" type="text" placeholder="Name" >
              </td>
            </tr>
            <tr>
              <td>Status </td>
              <td>
              <span class="select" id="apps1">
                <select v-model="selected">
                  <option v-for="option in options" v-bind:value="option.value">
                    {{ option.text }}
                  </option>
                </select>

              </span>
              </td>
            </tr>
            <tr>
            <td>
             <span>Selected: {{ selected }}</span>
             </td>
            </tr>
            <tr>
              <td>Discount </td>
              <td>
              <input ref="iddiscount" class="input" type="text" placeholder="Discount %">
              </td>
            </tr>
            <tr>
              <td>VAT</td>
              <td>
                <input ref="idvat" class="input" type="text" placeholder="VAT %">
              </td>
            </tr>
            <tr>
              <td>&nbsp;</td>
            </tr>
          </table>
        </div>
        <button type="submit" class="button btnclick is-primary" v-on:click="ok" > Submit </button>
              <a class="button" v-on:click="cancel">Cancel</a>
        </form>
      </article>
    </div>

  </card-modal>
  </div>
</template>

<script>
  import { CardModal } from 'vue-bulma-modal'
  import axios from 'axios'
  export default {
    components: {
      CardModal
    },
    props: {
      visible: Boolean,
      title: String,
      url: String
    },
    data: () => ({
      posts: [],
      errors: [],
      selected: 'Active',
      options: [
            { text: 'Active', value: 'Active' },
            { text: 'Inactive', value: 'Inactive' }
      ]
    }
    ),

    methods: {
      open (url) {
        window.open(url)
      },
      close () {
        this.$emit('close')
      },
      ok () {
        axios.post(`http://127.0.0.1:8080/api/logisticsss`, {
          logisticCode: 'haha',
          logisticName: this.$refs.idname.value,
          status: this.selected,
          discount: this.$refs.iddiscount.value,
          vat: this.$refs.idvat.value
        })
        this.$emit('ok')
      },
      cancel () {
        this.$emit('cancel')
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
    height: 45%;
  }
  .tablemodal {
    margin-left: 10%;
    width: 80%;
  }
  .centerbutton {
    padding-left: 40%;
  }
  .modal-card-foot {
  height:100%;
  }
</style>
