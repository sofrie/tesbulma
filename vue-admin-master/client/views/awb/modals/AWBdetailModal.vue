<template>
  <card-modal :visible="visible" @close="close" :title="title" transition="zoom" class="classmodalleft">
    <div class="tile is-parent classmodal">
      <article class="tile is-child ">
        <div class="block ">
          <table class="table" >
            <tr>
              <th>Reconciliation Data</th>
              <th>Blibli Data</th>
              <th>3PL Data</th>
            </tr>
            <tr>
              <td>
                <ul>
                  <li>
                    <label>Failure Reason :Data Mismatch</label>
                  </li>
                  <li>
                    <label>Merchant Code : MERCH-CODE-0001</label>
                  </li>
                  <li>
                    Merchant Name : Merchant 1
                  </li>
                  <li>
                    <label>Original Shipping Cost : Rp.xx.xxx.xxx</label>
                  </li>
                  <li>
                    <label>Adjusment Shipping Cost : Rp.xx.xxx.xxx</label>
                  </li>
                  <li>
                    <label>Notes : Setelah penyelidikan, ikut 3PL</label>
                  </li>
                </ul>
              </td>
              <td>
                <ul>
                  <li>
                    <label>Sender Name : Reza Lesmana</label>
                  </li>
                  <li>
                    <label>Sender Address : Jl.Jambu No.1</label>
                  </li>
                  <li>
                    <label>Origin Code : CGK001</label>
                  </li>
                  <li>
                    <label>Receiver Name : Sofriesilero Zumaytis</label>
                  </li>
                  <li>
                    <label>Receiver Address : Perum Kelapa</label>
                  </li>
                  <li>
                    <label>Destination Code : DPK001</label>
                  </li>
                </ul>
              </td>
              <td>
                <ul>
                  <li>
                    <label>Sender Name : Reza Lesmana</label>
                  </li>
                  <li>
                    <label>Sender Address : Jl.Jambu No.1</label>
                  </li>
                  <li>
                    <label>Origin Code : CGK001</label>
                  </li>
                  <li>
                    <label>Receiver Name : Sofriesilero Zumaytis</label>
                  </li>
                  <li>
                    <label>Receiver Address : Komplek Kelapa</label>
                  </li>
                  <li>
                    <label>Destination Code : DPK003</label>
                  </li>
                </ul>
              </td>
            </tr>
            <tr>
              <!--<td colspan="2">-->
              <!--<button class="button is-info ">Submit Upload</button>-->
              <!--</td>-->
            </tr>
          </table>
        </div>
      </article>
    </div>
    <div class="tile is-parent classmodal">
      <article class="tile is-child ">
        <h1 class="title">Charge Summary</h1>
        <div class="block ">
          <table class="table" width="200px" margin="10px">
            <tr>
              <th></th>
              <th>Weight</th>
              <th>Price/Kg</th>
              <th>Other Charge</th>
              <th>Gift Wrap Charge</th>
              <th>Insurance Charge</th>
              <th>Total Charge</th>
            </tr>
            <tr>
              <th>System</th>
              <td>2</td>
              <td>8700</td>
              <td>0</td>
              <td>0</td>
              <td>125</td>
              <td>17400</td>
            </tr>
            <tr>
              <th>Logistic</th>
              <td>3</td>
              <td>9000</td>
              <td>10000</td>
              <td>0</td>
              <td>150</td>
              <td>37150</td>
            </tr>
            <tr>
              <th>Applied</th>
              <td>3</td>
              <td>8700</td>
              <td>10000</td>
              <td>0</td>
              <td>150</td>
              <td>36250</td>
            </tr>
            <tr>
              <th>Comment</th>
              <td>Ikut 3PL</td>
              <td>Ikut Blibli</td>
              <td>Packing Kayu</td>
              <td>-</td>
              <td>-</td>
              <td>-</td>
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
    width: 80%;
    height: 90%;
  }
  .modal-card-foot {
    visibility: hidden;
  }
</style>
