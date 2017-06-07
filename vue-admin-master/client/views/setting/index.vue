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
                <td class="tdright"><label>Tolerance Persentage : &nbsp;</label></td>
                <td><input class="input" type="text" placeholder="3"></td>
              </tr>
              <tr>              &nbsp;
              </tr>
              <tr>
                <td class="tdright"><label>Tolerance Amount : &nbsp;</label></td>
                <td><input class="input" type="text" placeholder="20"></td>
              </tr>
            </table>
            <div>&nbsp</div>
              <table>
              <tr>
              <td colspan="3" class="tdcenter"><label class="label">Weight</label></td>
              </tr>
                <tr>
                  <td class="tdright"><label>Tolerance Persentage : &nbsp;</label></td>
                  <td><input class="input" type="text" placeholder="10"></td>
                </tr>
                <tr>              &nbsp;
                </tr>
                <tr>
                  <td class="tdright"><label>Tolerance Amount : &nbsp;</label></td>
                  <td><input class="input" type="text" placeholder="1"></td>
                </tr>
            </table>
            <div>&nbsp</div>
              <table>
              <tr>
              <td colspan="3" class="tdcenter"><label class="label">Insurance Charge</label></td>
              </tr>
                <tr>
                  <td class="tdright"><label>Tolerance Persentage : &nbsp;</label></td>
                  <td><input class="input" type="text" placeholder="10"></td>
                </tr>
                <tr>              &nbsp;
                </tr>
                <tr>
                  <td class="tdright"><label>Tolerance Amount : &nbsp;</label></td>
                  <td><input class="input" type="text" placeholder="2000"></td>
                </tr>
            </table>

            </div>
            <div class="column">
              <table>
              <tr>
              <td colspan="3" class="tdcenter"><label class="label">Price/Kg</label></td>
              </tr>
                <tr>
                  <td class="tdright"><label>Tolerance Persentage : &nbsp;</label></td>
                  <td><input class="input" type="text" placeholder="2"></td>
                </tr>
                <tr>              &nbsp;
                </tr>
                <tr>
                  <td class="tdright"><label>Tolerance Amount : &nbsp;</label></td>
                  <td><input class="input" type="text" placeholder="1000"></td>
                </tr>
            </table>
            <div>&nbsp</div>
              <table>
              <tr>
              <td colspan="3" class="tdcenter"><label class="label">Gift Wrap Charge</label></td>
              </tr>
                <tr>
                  <td class="tdright"><label>Tolerance Persentage : &nbsp;</label></td>
                  <td><input class="input" type="text" placeholder="15"></td>
                </tr>
                <tr>              &nbsp;
                </tr>
                <tr>
                  <td class="tdright"><label>Tolerance Amount : &nbsp;</label></td>
                  <td><input class="input" type="text" placeholder="3000"></td>
                </tr>
            </table>
            <div>&nbsp</div>
            <table>
              <tr>
              <td colspan="3" class="tdcenter"><label class="label">Other Charge</label></td>
              </tr>
              <tr>
                <td class="tdright"><label>Tolerance Persentage : &nbsp;</label></td>
              <td><input class="input" type="text" placeholder="3.5"></td>
              </tr>
              <tr>              &nbsp;
              </tr>
              <tr>
              <td class="tdright"><label>Tolerance Amount : &nbsp;</label></td>
              <td><input class="input" type="text" placeholder="1000"></td>
              </tr>
            </table>
            <table>
              <tr>
              <td> <button class="button pull-right">Cancel</button>
               <button class="button is-info pull-right marginright">Submit</button> </td>
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

  export default {
    components: {
      Cleave
    },

    data () {
      return {
        demo: {
          value: '',
          rawValue: ''
        }
      }
    },

    methods: {
      onRawValueChanged (newVal) {
        this.demo.rawValue = newVal
      }
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
