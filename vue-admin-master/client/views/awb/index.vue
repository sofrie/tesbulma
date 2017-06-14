<template>
  <div>
    <div class="tile is-parent">
      <div class="control is-horizontal">
        <form>
          <!--buat bikin for buat list nya-->
          <!--<li v-for="reconStatus in productCategories">-->
            <!--{{reconStatus}}-->
          <!--</li>-->
          <table>
            <tr>
              <td>
                <label> {{selected}} : </label>

                <span class="select">
                <select v-model="selected" v-on:change="changeMonth()">
                  <option value="January">January</option>
                  <option value="February">February</option>
                </select>
              </span>
              </td>
              <td>

                <label>{{selectedLogistic}} :</label>
                <span class="select">
          <select class="select" v-model="selectedLogistic" v-on:change="changeLogistic()">
            <option value="A Logistic">A Logistic</option>
            <option value="B Logistic">B Logistic</option>
            <option value="C Logistic">C Logistic</option>
            <option value="D Logistic">D Logistic</option>
          </select>
          </span>

              </td>
              <td>

                <div class="control is-horizontal">
                  <label>AWB : </label>
                  &nbsp;
                  <div class="control is-grouped">
                    <p class="control is-expanded">
                      <input class="input" type="text" placeholder="AWB" v-model="AwbNumber" v-on:change="changeAwbNumber()">
                    </p>
                  </div>
                </div>

              </td>
              &emsp;
              &emsp;
              <td>

                <div class="control is-horizontal">

                  <label>GDN  Ref # :</label>
                  &nbsp;
                  <div class="control is-grouped">
                    <p class="control is-expanded">
                      <input class="input" type="text" placeholder="Ref" v-model="gdnRef" v-on:change="changeGdnRef()">
                    </p>
                  </div>
                </div>
              </td>

            </tr>
          </table>
        </form>
      </div>


    </div>

    <div class="tile is-parent">
      <div class="control is-horizontal">
        <table>
          <tr>
            <td>
              &emsp;
              <label>Year : </label>

              <span class="select">
                <select  v-model="selectedYear" v-on:change="changeYear()">
                  <option>2017</option>
                  <option>2018</option>
                </select>
              </span>
            </td>
            <td>
              &nbsp;
              <label>Status :</label>
              <span class="select">
          <select class="select" v-model="statusawb" v-on:change="changeStatus()">
            <option value="All">All</option>
           <!--<option v-for="reconStatus in productCategories" :value="reconStatus">{{reconStatus}}</option>-->
            <option value="OK">OK</option>
            <option value="Problem Exist">Problem Exist</option>
          </select>
          </span>

            </td>
            <td>

              <div class="control is-horizontal">

                <label>Merchant Code : </label>
                &nbsp;
                <div class="control is-grouped">
                  <p class="control is-expanded">
                    <input class="input" type="text" placeholder="Code" v-model="merchantCode" v-on:change="changeMerchantCode()">
                  </p>
                </div>
              </div>

            </td>
            &emsp;
            &emsp;
            <td>
              <button class="button is-info pull-right" v-on:click="filterAll()">Search</button>
            </td>
          </tr>
        </table>
      </div>
    </div>
    <div class="tile is-ancestor">
      <div class="tile is-parent">
        <article class="tile is-child box">
          <h4 class="title">AWB List</h4>
          <div class="table-responsive">
            <table class="table is-bordered is-striped is-narrow">
              <thead >
              <tr>
                <th>Month</th>
                <th>Year</th>
                <th>Logistic</th>
                <th>AWB</th>
                <th>Recon Status</th>
                <th>Merchant Code</th>
                <th>GDN Ref #</th>
              </tr>
              </thead>
              <tbody>

              <tr v-for="post of posts">
                <td>{{post.month}}</td>
                <td>{{post.year}}</td>
                <td>{{post.logisticName}}</td>
                <td>{{post.awbNumber}}</td>
                <td>{{post.reconStatus}}</td>
                <td>{{post.merchantCode}}</td>
                <td>{{post.gdnRef}}</td>
              </tr>

              </tbody>
            </table>
            <div id="light2" class="white_content">
              <p class="control has-addons has-addons-right">
                <a
                  onclick="document.getElementById('light2').style.display='none';document.getElementById('fade2').style.display='none'">X &nbsp;</a>
              </p>
              <div class="tile is-parent">
                <article class="tile is-child ">
                  <h1 class="title">AWB13245 / GDN Ref-#1 (Problem Exist)</h1>
                  <div class="block ">
                    <table class="table" width="200px" margin="10px">
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
              <div class="tile is-parent">
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
            </div>

            <div id="fade2" class="black_overlay"></div>
          </div>
        </article>
      </div>

    </div>
  </div>
</template>

<script>
  import Vue from 'vue'
  import Modal from './modals/Modal'
  import AWBdetailModal from './modals/AWBdetailModal'

  import uniq from 'lodash/uniq'
  import axios from 'axios'
  const AWBdetailModalComponent = Vue.extend(AWBdetailModal)
  const openCardModal = (propsData = {
    visible: true
  }) => {
    return new AWBdetailModalComponent({
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
      statuss: [],
      tempstatus: [],
      showModal: true,
      cardModal: null,
      imageModal: null,
      selected: 'January',
      statusawb: 'All',
      selectedYear: '2017',
      selectedLogistic: 'A Logistic',
      AwbNumber: '',
      merchantCode: '',
      gdnRef: ''
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
        const cardModal = this.AWBdetailModal || (this.AWBdetailModal = openCardModal({title: 'AWB13245 / GDN Ref-#1 (Problem Exist)', url: this.$store.state.pkg.homepage}))
        cardModal.$children[0].active()
      },
      changeStatus () {
        axios.get('http://127.0.0.1:8080/api/awb/filterstatus/' + this.statusawb)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },

      changeMonth () {
        axios.get('http://127.0.0.1:8080/api/awb/' + this.selected)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
      changeYear () {
        axios.get('http://127.0.0.1:8080/api/awb/filteryear/' + this.selectedYear)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
      changeLogistic () {
        axios.get('http://127.0.0.1:8080/api/awb/filterlogisticName/' + this.selectedLogistic)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
      changeAwbNumber () {
        axios.get('http://127.0.0.1:8080/api/awb/filterAwbNumber/' + this.AwbNumber)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
      changeMerchantCode () {
        axios.get('http://127.0.0.1:8080/api/awb/filterMerchantCode/' + this.merchantCode)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
      changeGdnRef () {
        axios.get('http://127.0.0.1:8080/api/awb/filterGdnRef/' + this.gdnRef)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
      filterAll () {
        axios.get('http://127.0.0.1:8080/api/awb/filter/' + this.selected + '/' + this.selectedYear + '/' + this.selectedLogistic + '/' + this.AwbNumber + '/' + this.statusawb + '/' + this.merchantCode + '/' + this.gdnRef)
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
      axios.get(`http://127.0.0.1:8080/api/awb`)
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
    },
    computed: {
      productCategories () {
        this.statuss = uniq(this.posts.map(p => p.reconStatus))
        return this.statuss
      }
    }
  }
</script>

<style lang="scss">
  #vertical-2 thead, #vertical-2 tbody {
    display: inline-block;
  }

  td {
    width: 200px;
  }
  .black_overlay {
    display: none;
    position: fixed;
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
    position: fixed;
    left: 0%;
    top:20%;
    width: 100%;
    height: 120%;
    padding: 1px;
    border: 2px solid black;
    background-color: white;
    z-index: 1002;
    overflow: auto;
  }
  .table-responsive {
    display: block;
    width: 100%;
    min-height: .01%;
  }

  .tablepopup {
    display: block;
    top: 0%;
    left: 30%;
    width: 30%;
    padding: 50px;
  }

</style>
