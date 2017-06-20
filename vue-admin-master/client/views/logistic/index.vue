<template>
  <div>
    <form>
      <div class="tile is-ancestor">
        <a class="button is-info leftleft" @click="openModalCard()">Add Logistic</a>
        <div class="select rightright">

          <select v-model="selected" v-on:change="changeStatus">
            <option value="All">All</option>
            <option value="Active">Active</option>
            <option value="Inactive">Inactive</option>
          </select>
        </div>
      </div>
      <div class="tile is-ancestor">
        <div class="tile is-parent">
          <div class="table-responsive">
            <table v-model="selected2" class="table is-bordered is-striped is-narrow">
              <thead>
              <tr>
                <th>Logistic Name</th>
                <th>Status</th>
                <th>Discount</th>
                <th>VAT</th>
              </tr>
              </thead>
              <tr v-for="post of posts">
                <td v-on:click="sayConsole(post.id)">{{post.logisticName}}</td>
                <td>{{post.status}}</td>
                <td>{{post.discount}}%</td>
                <td>{{post.vat}}%</td>
              </tr>

              <!--</tbody>-->
              <!--<tr>-->
                <!--<td v-for="post of posts">-->
                  <!--<p><strong>{{post.name}}</strong></p>-->
                <!--</td>-->
              <!--</tr>-->
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

  import axios from 'axios'
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
    data: () => ({
      posts: [],
      errors: [],
      showModal: true,
      cardModal: null,
      imageModal: null,
      selected: 'All',
      selected2: 1,
      options: [
        { text: 'Active', value: 'Active' },
        { text: 'Inactive', value: 'Inactive' }
      ]
    }
    ),
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
      },
      changeStatus () {
        axios.get('http://127.0.0.1:8080/api/logistics/' + this.selected)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      }
    },

    // Fetches posts when the component is created.
    created () {
      axios.get(`http://127.0.0.1:8080/api/logistics`)
        .then(response => {
          // JSON responses are automatically parsed.
          this.posts = response.data
        })
        .catch(e => {
          this.errors.push(e)
        })

      // async / await version (created() becomes async created())
      //
      // try {
      //   const response = await axios.get(`http://jsonplaceholder.typicode.com/posts`)
      //   this.posts = response.data
      // } catch (e) {
      //   this.errors.push(e)
      // }
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
