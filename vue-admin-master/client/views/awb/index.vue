<template>
  <div>
    <div class="is-parent">
      <div class="block">
	<div class="control is-horizontal">
		<div class="control-label">
			<label class="label">Month : </label>
		</div>
		<div class="control">
			<div class="select is-fullwidth">
				<select v-model="selected" v-on:change="changeMonth()">
					<option value="January">January</option>
					<option value="February">February</option>
					<option value="Maret">Maret</option>
					<option value="April">April</option>
					<option value="Mei">Mei</option>
					<option value="Juni">Juni</option>
					<option value="Juli">Juli</option>
					<option value="Agustus">Agustus</option>
					<option value="September">September</option>
					<option value="Oktober">Oktober</option>
					<option value="November">November</option>
					<option value="Desember">Desember</option>
				</select>
			</div>
		</div>
		<div class="control-label">
			<label class="label">Logistic : </label>
		</div>
		<div class="control">
			<div class="select is-fullwidth">
				<select class="select" v-model="selectedLogistic" v-on:change="changeLogistic()">
					<option value="A Logistic">A Logistic</option>
					<option value="B Logistic">B Logistic</option>
					<option value="C Logistic">C Logistic</option>
					<option value="D Logistic">D Logistic</option>
				</select>
			</div>
		</div>
		<div class="control-label">
			<label class="label">AWB : </label>
		</div>
		<div class="control is-grouped">
			<p class="control is-expanded">
				<input type="text" placeholder="AWB Number" class="input" v-model="AwbNumber" v-on:change="changeAwbNumber()">
			</p>
		</div>
		<div class="control-label">
			<label class="label">GDN Ref# : </label>
		</div>
		<div class="control is-grouped">
			<p class="control is-expanded">
				<input type="text" placeholder="GDN Ref" class="input" v-model="gdnRef" v-on:change="changeGdnRef()">
			</p>
		</div>
	</div>
	<div class="control is-horizontal">
		<div class="control-label">
			<label class="label">Year : </label>
		</div>
		<div class="control">
			<div class="select is-fullwidth">
				<select v-model="selectedYear" v-on:change="changeYear()">
					<option>2017</option>
					<option>2018</option>
				</select>
			</div>
		</div>
		<div class="control-label">
			<label class="label">Status : </label>
		</div>
		<div class="control">
			<div class="select is-fullwidth">
				<select class="select" v-model="statusawb" v-on:change="changeStatus()">
					<option value="OK">OK</option>
					<option value="Problem Exist">Problem Exist</option>
				</select>
			</div>
		</div>
		<div class="control-label">
			<label class="label">Merchant Code : </label>
		</div>
		<div class="control is-grouped">
			<p class="control is-expanded">
				<input type="text" placeholder="AWB Number" class="input" v-model="merchantCode" v-on:change="changeMerchantCode()">
			</p>
		</div>
		<div class="control-label btn-search">
			<button class="button is-info pull-right" v-on:click="filterAll()">Search</button>
		</div>
		<div class="control"></div>
	</div>
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

              <tr v-for="post of posts" v-on:click="openModalCard(post)">
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
                              <label>Failure Reason : Mismatch</label>
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

      openModalCard (numb) {
        this.$emit('close')
        const cardModal = this.AWBdetailModal || (this.AWBdetailModal = openCardModal({title: numb.awbNumber + ' / ' + numb.gdnRef + ' (' + numb.reconStatus + ') ', url: this.$store.state.pkg.homepage, id: numb.awbNumber}))
        cardModal.$children[0].active()
        document.getElementById('kotak').style.width = '90vw'
      },
      changeStatus () {
        axios.get('http://127.0.0.1:8091/api/awb/filterstatus/' + this.statusawb)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },

      changeMonth () {
        axios.get('http://127.0.0.1:8091/api/awb/' + this.selected)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
      changeYear () {
        axios.get('http://127.0.0.1:8091/api/awb/filteryear/' + this.selectedYear)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
      changeLogistic () {
        axios.get('http://127.0.0.1:8091/api/awb/filterlogisticName/' + this.selectedLogistic)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
      changeAwbNumber () {
        axios.get('http://127.0.0.1:8091/api/awb/filterAwbNumber/' + this.AwbNumber)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
      changeMerchantCode () {
        axios.get('http://127.0.0.1:8091/api/awb/filterMerchantCode/' + this.merchantCode)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
      changeGdnRef () {
        axios.get('http://127.0.0.1:8091/api/awb/filterGdnRef/' + this.gdnRef)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
      filterAll () {
        axios.get('http://127.0.0.1:8091/api/awb/filter/' + this.selected + '/' + this.selectedYear + '/' + this.selectedLogistic + '/' + this.AwbNumber + '/' + this.statusawb + '/' + this.merchantCode + '/' + this.gdnRef)
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
      var elements = document.getElementsByClassName('app-sidebar')
      for
(var i = 0, length = elements.length; i < length; i++) {
        elements[i].style.display = 'block'
      }
      axios.get(`http://127.0.0.1:8091/api/awb`)
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
  .control-label{
	flex-basis:100px;
	margin-right:10px
  }
  .btn-search{
	padding-top:0px;
	text-align:left;
  }
</style>
