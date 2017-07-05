<template>
  <div>
    <div class="tile is-ancestor">
      <div class="tile is-parent">
        <div class="tile is-child ">

          <div class="columns">
            <div class="column">
            <table>
              <tr>
              <td colspan="3" class="tdcenter"><label class="label">Total Shipping</label></td>
              </tr>
              <tr>
                <td class="tdright"><label>Tolerance Percentage : &nbsp;</label></td>
                <td><input class="input" type="text" ref="totalShippingPercentage"  v-model="ShippingP"></td>
              </tr>
              <tr>              &nbsp;
              </tr>
              <tr>
                <td class="tdright"><label>Tolerance Amount : &nbsp;</label></td>
                <td><input class="input" type="text" ref="totalShippingAmount" v-model="ShippingA"></td>
              </tr>
            </table>
            <div>&nbsp</div>
              <table>
              <tr>
              <td colspan="3" class="tdcenter"><label class="label">Weight</label></td>
              </tr>
                <tr>
                  <td class="tdright"><label>Tolerance Percentage : &nbsp;</label></td>
                  <td><input class="input" type="text" ref="weightPercentage" v-model="weightP"></td>
                </tr>
                <tr>              &nbsp;
                </tr>
                <tr>
                  <td class="tdright"><label>Tolerance Amount : &nbsp;</label></td>
                  <td><input class="input" type="text" ref="weightAmount" v-model="weightA"></td>
                </tr>
            </table>
            <div>&nbsp</div>
              <table>
              <tr>
              <td colspan="3" class="tdcenter"><label class="label">Insurance Charge</label></td>
              </tr>
                <tr>
                  <td class="tdright"><label>Tolerance Percentage : &nbsp;</label></td>
                  <td><input class="input" type="text" ref="insuranceChargePercentage" v-model="insuranceChargeP"></td>
                </tr>
                <tr>              &nbsp;
                </tr>
                <tr>
                  <td class="tdright"><label>Tolerance Amount : &nbsp;</label></td>
                  <td><input class="input" type="text" ref="insuranceChargeAmount" v-model="insuranceChargeA"></td>
                </tr>
            </table>

            </div>
            <div class="column">
              <table>
              <tr>
              <td colspan="3" class="tdcenter"><label class="label">Price/Kg</label></td>
              </tr>
                <tr>
                  <td class="tdright"><label>Tolerance Percentage : &nbsp;</label></td>
                  <td><input class="input" type="text" ref="pricePercentage" v-model="priceP"></td>
                </tr>
                <tr>              &nbsp;
                </tr>
                <tr>
                  <td class="tdright"><label>Tolerance Amount : &nbsp;</label></td>
                  <td><input class="input" type="text" ref="priceAmount" v-model="priceA"></td>
                </tr>
            </table>
            <div>&nbsp</div>
              <table>
              <tr>
              <td colspan="3" class="tdcenter"><label class="label">Gift Wrap Charge</label></td>
              </tr>
                <tr>
                  <td class="tdright"><label>Tolerance Percentage : &nbsp;</label></td>
                  <td><input class="input" type="text" ref="giftWrapChargePercentage" v-model="giftWrapChargeP"></td>
                </tr>
                <tr>              &nbsp;
                </tr>
                <tr>
                  <td class="tdright"><label>Tolerance Amount : &nbsp;</label></td>
                  <td><input class="input" type="text" ref="giftWrapChargeAmount" v-model="giftWrapChargeA"></td>
                </tr>
            </table>
            <div>&nbsp</div>
            <table>
              <tr>
              <td colspan="3" class="tdcenter"><label class="label">Other Charge</label></td>
              </tr>
              <tr>
                <td class="tdright"><label>Tolerance Percentage : &nbsp;</label></td>
              <td><input class="input" type="text" ref="otherChargePercentage" v-model="otherChargeP"></td>
              </tr>
              <tr>              &nbsp;
              </tr>
              <tr>
              <td class="tdright"><label>Tolerance Amount : &nbsp;</label></td>
              <td><input class="input" type="text" ref="otherChargeAmount" v-model="otherChargeA"></td>
              </tr>
            </table>
            <table>
              <tr>
              <td> <button class="button pull-right" v-on:click="cancel">Cancel</button>
               <button class="button is-info pull-right marginright" type="submit" v-on:click="ok">Submit</button> </td>
              </tr>
            </table>
            </div>
          </div>
        </div>
      </div>

    </div>

  </div>
</template>

<script>
  import Cleave from 'vue-cleave'
  import 'cleave.js/dist/addons/cleave-phone.cn'
  import axios from 'axios'

  export default {
    components: {
      Cleave
    },

    data: () => ({
      posts: [],
      ShippingP: '',
      ShippingA: '',
      weightP: '',
      weightA: '',
      insuranceChargeP: '',
      insuranceChargeA: '',
      priceP: '',
      priceA: '',
      giftWrapChargeP: '',
      giftWrapChargeA: '',
      otherChargeP: '',
      otherChargeA: ''
    }
    ),
    methods: {
      onRawValueChanged (newVal) {
        this.demo.rawValue = newVal
      },
      ok () {
        axios.post(`http://127.0.0.1:8080/api/tolerances`, {
          id: '1',
          totalShippingPercentage: this.$refs.totalShippingPercentage.value,
          totalShippingAmount: this.$refs.totalShippingAmount.value,
          weightPercentage: this.$refs.weightPercentage.value,
          weightAmount: this.$refs.weightAmount.value,
          insuranceChargePercentage: this.$refs.insuranceChargePercentage.value,
          insuranceChargeAmount: this.$refs.insuranceChargeAmount.value,
          pricePercentage: this.$refs.pricePercentage.value,
          priceAmount: this.$refs.priceAmount.value,
          giftWrapChargePercentage: this.$refs.giftWrapChargePercentage.value,
          giftWrapChargeAmount: this.$refs.giftWrapChargeAmount.value,
          otherChargePercentage: this.$refs.otherChargePercentage.value,
          otherChargeAmount: this.$refs.otherChargeAmount.value
        })
        this.$emit('ok')
      },
      cancel () {
        axios.get(`http://127.0.0.1:8080/api/tolerances`)
          .then(response => {
            // JSON responses are automatically parsed.
            this.ShippingP = response.data.totalShippingPercentage
            this.ShippingA = response.data.totalShippingAmount
            this.weightP = response.data.weightPercentage
            this.weightA = response.data.weightAmount
            this.insuranceChargeP = response.data.insuranceChargePercentage
            this.insuranceChargeA = response.data.insuranceChargeAmount
            this.priceP = response.data.pricePercentage
            this.priceA = response.data.priceAmount
            this.giftWrapChargeP = response.data.giftWrapChargePercentage
            this.giftWrapChargeA = response.data.giftWrapChargeAmount
            this.otherChargeP = response.data.otherChargePercentage
            this.otherChargeA = response.data.otherChargeAmount
          })
          .catch(e => {
            this.errors.push(e)
          })
        this.$emit('ok')
      }
    },
    created () {
      axios.get(`http://127.0.0.1:8080/api/tolerances`)
      .then(response => {
        // JSON responses are automatically parsed.
        this.ShippingP = response.data.totalShippingPercentage
        this.ShippingA = response.data.totalShippingAmount
        this.weightP = response.data.weightPercentage
        this.weightA = response.data.weightAmount
        this.insuranceChargeP = response.data.insuranceChargePercentage
        this.insuranceChargeA = response.data.insuranceChargeAmount
        this.priceP = response.data.pricePercentage
        this.priceA = response.data.priceAmount
        this.giftWrapChargeP = response.data.giftWrapChargePercentage
        this.giftWrapChargeA = response.data.giftWrapChargeAmount
        this.otherChargeP = response.data.otherChargePercentage
        this.otherChargeA = response.data.otherChargeAmount
      })
      .catch(e => {
        this.errors.push(e)
      })
    },
    watch: {
      'demo.value' (newVal, oldVal) {
        console.log('value: new ->', newVal, 'old ->', oldVal)
      },
      'demo.rawValue' (newVal, oldVal) {
        console.log('rawValue: new ->', newVal, 'old ->', oldVal)
      }
    }
  }
</script>

<style lang="scss" scoped>
  @import '~bulma/sass/utilities/mixins';

  .button {
    margin: 5px 0 0;
  }

  .control .button {
    margin: inherit;
  }

  .control.has-addons {
    @include mobile() {
      input {
        width: 100%;
      }

      input.is-expanded {
        flex-shrink: 1;
      }
    }
  }
  .marginright {
    margin-right: 10px;
  }
  .tdright {
    text-align: right;
  }
  .tdcenter {
    padding-left: 20%;
  }
</style>
