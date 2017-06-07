<template>
  <div>
    <div class="tile is-ancestor">


      <div class="tile is-parent">
        <div class="tile is-child ">

          <div class="columns">
            <div class="column">
              <div class="control">
                <label class="label">Credit card number</label>
                <cleave class="input" placeholder="Enter credit card number" :options="{ creditCard: true }"></cleave>
              </div>
              <div class="control">
                <label class="label">Phone number</label>
                <cleave class="input" type="tel" placeholder="Enter phone number" :options="{ phone: true, phoneRegionCode: 'cn' }"></cleave>
              </div>
              <div class="control">
                <label class="label">Numeral</label>
                <cleave class="input" placeholder="Enter numeral" :options="{ numeral: true, numeralThousandsGroupStyle: 'thousand' }"></cleave>
              </div>
            </div>
            <div class="column">
              <div class="control">
                <label class="label">Date</label>
                <cleave class="input" placeholder="YYYY/MM/DD" :value="'20160901'" :options="{ date: true, datePattern: ['Y', 'm', 'd'] }"></cleave>
              </div>
              <div class="control">
                <cleave class="input" placeholder="MM/YY" :options="{ date: true, datePattern: ['m', 'y'] }"></cleave>
              </div>
              <div class="control">
                <label class="label">Raw Value</label>
                <cleave
                  class="input"
                  v-model="demo.value"
                  @rawValueChanged="onRawValueChanged"
                  placeholder="Enter phone number"
                  :options="{ blocks: [0, 3, 3, 4], numericOnly: true, delimiters: ['(', ') ', '-'], maxLength: 14 }">
                </cleave>
              </div>
            </div>
            <div class="column">
              <div class="control">
                <label class="label">Custom options</label>
                <cleave class="input" placeholder="Blocks: [4, 3, 3, 4]" :options="{ blocks: [4, 3, 3, 4], uppercase: true }"></cleave>
              </div>
              <div class="control">
                <cleave class="input" placeholder="Delimiter: '·'" :options="{ delimiter: '·', blocks: [3, 3, 3, 3], uppercase: true }"></cleave>
              </div>
              <div class="control">
                <cleave class="input" :options="{ prefix: 'PREFIX', delimiter: '-', blocks: [6, 4, 4, 4], uppercase: true }"></cleave>
              </div>
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
</style>
