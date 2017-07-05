<template>
  <card-modal :visible="visible" @close="close" :title="title" transition="zoom" class="classmodalleft awb-modal-card">
    <div class="tile is-parent classmodal">
      <article class="tile is-child ">
        <div class="block ">
          <table class="table awb-detail" >
            <tr>
              <th>Reconciliation Data</th>
              <th>Blibli Data</th>
              <th>3PL Data</th>
            </tr>
            <tr v-for="item of awb" >
              <td>
                <ul>
                  <li>
                    <label>Failure Reason : {{item.failure}}</label>
                  </li>
                  <li>
                    <label>Merchant Code : {{item.merchantCode}}</label>
                  </li>
				  <li>
                    Merchant Name : {{item.merchantName}}
                  </li>
                  <li>
                    <label>Original Shipping Cost : Rp. {{item.focsAmount}}</label>
                  </li>
                  <li>
                    <label>Adjusment Shipping Cost : Rp. {{item.focsaAmount}}</label>
                  </li>
                  <li>
                    <label>Notes : {{item.notes}}</label>
                  </li>
                </ul>
              </td>
              <td>
                <ul>
                  <li>
                    <label>Sender Name : {{item.namaPengirimSystem}}</label>
                  </li>
                  <li>
                    <label>Sender Address : {{item.alamatPengirimSystem}}</label>
                  </li>
                  <li>
                    <label>Origin Code : {{item.kodeOriginSystem}}</label>
                  </li>
                  <li>
                    <label>Receiver Name : {{item.namaPenerimaSystem}}</label>
                  </li>
                  <li>
                    <label>Receiver Address : {{item.alamatPenerimaSystem}}</label>
                  </li>
                  <li>
                    <label>Destination Code : {{item.kodeDestinasiSystem}}</label>
                  </li>
                </ul>
              </td>
              <td>
                <ul>
                  <li>
                    <label>Sender Name : {{item.namaPengirimAPI}}</label>
                  </li>
                  <li>
                    <label>Sender Address : {{item.alamatPengirimAPI}}</label>
                  </li>
                  <li>
                    <label>Origin Code : {{item.kodeOriginAPI}}</label>
                  </li>
                  <li>
                    <label>Receiver Name : {{item.namaPenerimaAPI}}</label>
                  </li>
                  <li>
                    <label>Receiver Address : {{item.alamatPenerimaAPI}}</label>
                  </li>
                  <li>
                    <label>Destination Code : {{item.kodeDestinasiAPI}}</label>
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
		  
		  <h1 class="title">Charge Summary</h1>
        
          <table class="table awb-detail" v-for="item of awb" >
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
              <td>{{item.weightSystem}}</td>
              <td>{{item.priceSystem}}</td>
              <td>{{item.otherChargeSystem}}</td>
              <td>{{item.giftWrapChargeSystem}}</td>
              <td>{{item.insuranceChargeSystem}}</td>
              <td>{{item.totalChargeSystem}}</td>
            </tr>
            <tr>
              <th>Logistic</th>
              <td>{{item.weightLogistic}}</td>
              <td>{{item.priceLogistic}}</td>
              <td>{{item.otherChargeLogistic}}</td>
              <td>{{item.giftWrapChargeLogistic}}</td>
              <td>{{item.insuranceChargeLogistic}}</td>
              <td>{{item.totalChargeLogistic}}</td>
            </tr>
            <tr>
              <th>Applied</th>
              <td>{{item.weightApplied}}</td>
              <td>{{item.priceApplied}}</td>
              <td>{{item.otherChargeApplied}}</td>
              <td>{{item.giftWrapChargeApplied}}</td>
              <td>{{item.insuranceChargeApplied}}</td>
              <td>{{item.totalChargeApplied}}</td>
            </tr>
            <tr>
              <th>Comment</th>
              <td>{{item.weightComment}}</td>
              <td>{{item.priceComment}}</td>
              <td>{{item.otherChargeComment}}</td>
              <td>{{item.giftWrapChargeComment}}</td>
              <td>{{item.insuranceChargeComment}}</td>
              <td>{{item.totalChargeComment}}</td>
            </tr>
          </table>
        </div>
      </article>
    </div>
    
  </card-modal>
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
      url: String,
      id: String
    },

    data: () => ({
      awb: []
    }
    ),
    methods: {
      open (url) {
        window.open(url)
      }
    },
    created () {
      axios.get('http://127.0.0.1:8080/api/awb/filterAwbNumber/' + this.id)
        .then(response => {
          this.awb = response.data
        })
        .catch(e => {
          this.errors.push(e)
        })
    },
    close () {
      this.$emit('close')
    }
    }
  
</script>
<style>
  .classmodal{
  }
  .classmodalleft {

  }
  .awb-modal-card .modal-card {
/*    width: 80vw;
    height: 90vh;*/
	width:1200px;
  }
  .modal-card-foot {
    visibility: hidden;
  }
  .awb-detail tr td{
   width:200px;
   margin:10px;
  }
  .awb-detail{
	width:100%;
  }
  .modal-card-body{
	border-bottom-left-radius: 5px;
    border-bottom-right-radius: 5px;
  }
</style>
