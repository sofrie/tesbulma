<template>
  <div>
    <form>
      <div class="tile is-ancestor">
        <button class="button is-info leftleft" @click="openModalCard()">Add Logistic</button>
        <div class="select rightright">

          <select>
            <option value="2016">All</option>
            <option value="2017">Active</option>
            <option value="2017">Inactive</option>
          </select>
        </div>
      </div>
      <div class="tile is-ancestor">
        <div class="tile is-parent">
          <div class="table-responsive">
            <table class="table is-bordered is-striped is-narrow">
              <thead>
              <tr>
                <th>Logistic Name</th>
                <th>Status</th>
                <th>Discount</th>
                <th>VAT</th>
              </tr>
              </thead>
              <tbody>
              <tr>
                <td>A Logistic</td>
                <td>Active</td>
                <td>5%</td>
                <td>1%</td>
              </tr>
              <tr>
                <td>B Logistic</td>
                <td>Active</td>
                <td>2.25%</td>
                <td>1%</td>
              </tr>
              <tr>
                <td>C Logistic</td>
                <td>Active</td>
                <td>3.15%</td>
                <td>1%</td>
              </tr>
              <tr>
                <td>D Logistic</td>
                <td>Inactive</td>
                <td>1.75%</td>
                <td>1%</td>
              </tr>

              </tbody>
            </table>
          </div>
        </div>
      </div>
    </form>
  </div>
</template>
<script>
  import Vue from 'vue'
  import Modal from './modals/Modal'
  import AddLogisticModal from './modals/AddLogisticModal'

  const AddLogisticModalComponent = Vue.extend(AddLogisticModal)

  const openCardModal = (propsData = {
    visible: true
  }) => {
    return new AddLogisticModalComponent({
      el: document.createElement('div'),
      propsData
    })
  }

  export default {
    components: {
      Modal
    },

    data () {
      return {
        showModal: true,
        cardModal: null,
        imageModal: null
      }
    },

    methods: {
      openModalBasic () {
        this.showModal = true
      },

      closeModalBasic () {
        this.showModal = false
      },

      openModalCard () {
        const cardModal = this.AddLogisticModal || (this.AddLogisticModal = openCardModal({title: 'Add Logistic', url: this.$store.state.pkg.homepage}))
        cardModal.$children[0].active()
      }
    }
  }
</script>

<style lang="scss">
  .table-responsive {
    display: block;
    width: 100%;
    min-height: .01%;
    overflow-x: auto;
  }

  .black_overlay {
    display: none;
    position: absolute;
    top: 0%;
    left: 0%;
    width: 100%;
    height: 100%;
    z-index: 1001;
    -moz-opacity: 0.8;
    opacity: .80;
    filter: alpha(opacity=80);
  }

  .white_content {
    display: none;
    position: absolute;
    left: 25%;
    width: 25%;
    height: 80%;
    padding: 1px;
    border: 2px solid black;
    background-color: white;
    z-index: 1002;
    overflow: auto;
  }

  .leftleft {
    margin-left: 1%;
  }
  .rightright {
    position: relative;
    margin-left: 84%;
  }
</style>
