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
				<select v-on:change="changeMonth()" v-model="selectedMonth">
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
			<label class="label">Year : </label>
		</div>
		<div class="control">
			<div class="select is-fullwidth">
				<select v-on:change="changeYear()" v-model="selectedYear">
					<option>2017</option>
					<option>2018</option>
				</select>
			</div>
		</div>
		<div class="control-label">
			<label class="label">Logistic : </label>
		</div>
		<div class="control">
			<div class="select is-fullwidth">
				<select v-on:change="changeLogistic()" v-model="selectedLogistic">
					<option value="A Logistic">A Logistic</option>
					<option value="B Logistic">B Logistic</option>
					<option value="C Logistic">C Logistic</option>
					<option value="D Logistic">D Logistic</option>
				</select>
			</div>
		</div>
		<div class="control-label btn-search">
			<button class="button is-info" > Search</button>
			<a class="button is-info" @click="openModalCard()">
				Upload
			  </a>
		</div>
	</div>
	</div>
    </div>
    <div class="block">
      <article class="tile is-child box">
        <h2 class="title">Summary - Invoice A Logistic / January / 2017</h2>
        <div class="tile is-parent is-12">
          <table >
            <tr>
              <td >
                <b >OK :298527 data</b></td>
              <td>
                <b>Problem Exist : 219 data</b></td>
              <td>
                <b>Status:Open</b></td>
              <td>
                <b>Jumlah Tagihan:Rp.xx.xxx</b></td>
            </tr>
          </table>
        </div>
        <button class="button is-info">View Data</button>
        <button class="button is-info">Download</button>
        <button class="button is-info pull-right one">Approve</button>
        <button class="button is-info pull-right" v-on:click="uploaded()">Submit</button>
      </article>
    </div>

    <div class="tile is-ancestor">
      <div class="tile is-parent">
        <article class="tile is-child box">
          <h4 class="title">Upload History</h4>
          <div class="table-responsive">
            <table class="table is-bordered is-striped is-narrow">
              <thead>
              <tr>
                <th>Month</th>
                <th>Year</th>
                <th>OK</th>
                <th>Problem Exists</th>
                <th>Jumlah Tagihan</th>
                <th>Logistic</th>
                <th>Status</th>
                <th>Last Modified</th>
              </tr>
              </thead>
              <tbody>
              <tr v-for="post of posts">
                <td>{{post.month}}</td>
                <td>{{post.year}}</td>
                <td>{{post.ok}}</td>
                <td>{{post.problemExist}}</td>
                <td>{{post.jumlahTagihan}}</td>
                <td>{{post.logistic}}</td>
                <td>{{post.status}}</td>
                <td>{{post.last_modified}}</td>
              </tr>
              </tbody>
            </table>
          </div>
        </article>
      </div>
    </div>
  </div>
</template>
<script>
  import {Collapse, Item as CollapseItem} from 'vue-bulma-collapse'

  import Vue from 'vue'
  import UploadModal from './modals/UploadModal'
  import Modal from './modals/Modal'
  import axios from 'axios'

  const UploadModalComponent = Vue.extend(UploadModal)

  const openCardModal = (propsData = {
    visible: true
  }) => {
    return new UploadModalComponent({
      el: document.createElement('div'),
      propsData
    })
  }

  export default {
    components: {
      Modal,
      Collapse,
      CollapseItem
    },

    data () {
      return {
        posts: [],
        errors: [],
        showModal: true,
        cardModal: null,
        imageModal: null,
        selectedMonth: 'January',
        selectedYear: '2017',
        selectedLogistic: 'A Logistic'
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
        const cardModal = this.AWBdetailModal || (this.AWBdetailModal = openCardModal({title: 'Upload Invoice', url: this.$store.state.pkg.homepage}))
        cardModal.$children[0].active()
      },
      uploaded () {
        axios.post(`http://127.0.0.1:8080/api/uploadHistory`, {
          month: this.selectedMonth,
          year: '2017',
          logistic: this.selectedLogistic
        })
      },
      changeMonth () {
        axios.get('http://127.0.0.1:8080/api/uploadHistory/month/' + this.selectedMonth)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
      changeYear () {
        axios.get('http://127.0.0.1:8080/api/uploadHistory/year/' + this.selectedYear)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
      changeLogistic () {
        axios.get('http://127.0.0.1:8080/api/uploadHistory/logistic/' + this.selectedLogistic)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      }
    },
    created () {
      axios.get(`http://127.0.0.1:8080/api/uploadHistory`)
        .then(response => {
          // JSON responses are automatically parsed.
          this.posts = response.data
        })
        .catch(e => {
          this.errors.push(e)
        })
    }
  }
</script>
<style lang="scss">
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

  /*.black_overlay {*/
    /*display: none;*/
    /*position: fixed;*/
    /*top: 0%;*/
    /*left: 0%;*/
    /*width: 100%;*/
    /*height: 100%;*/
    /*z-index: 1001;*/
    /*-moz-opacity: 0.8;*/
    /*opacity: .80;*/
    /*filter: alpha(opacity=80);*/
  /*}*/

  /*.white_content {*/
    /*display: none;*/
    /*position: fixed;*/
    /*left: 30%;*/
    /*width: 25%;*/
    /*height: 60%;*/
    /*padding: 1px;*/
    /*border: 2px solid black;*/
    /*background-color: white;*/
    /*z-index: 1002;*/
    /*overflow: auto;*/
  /*}*/

  /*<!--.black_overlay2 {-->*/
    /*<!--display: none;-->*/
    /*<!--position: fixed;-->*/
    /*<!--top: -30%;-->*/
    /*<!--left: 0%;-->*/
    /*<!--width: 100%;-->*/
    /*<!--height: 100%;-->*/
    /*<!--z-index: 1001;-->*/
    /*<!-- -moz-opacity: 0.8;-->*/
    /*<!--opacity: .80;-->*/
    /*<!--filter: alpha(opacity=80);-->*/
  /*<!--}-->*/

  /*<!--.white_content2 {-->*/
    /*<!--display: none;-->*/
    /*<!--position: fixed;-->*/
    /*<!--top: 10%;-->*/
    /*<!--left: 25%;-->*/
    /*<!--width: 50%;-->*/
    /*<!--height: 80%;-->*/
    /*<!--padding: 1px;-->*/
    /*<!--border: 2px solid black;-->*/
    /*<!--background-color: white;-->*/
    /*<!--z-index: 1002;-->*/
    /*<!--overflow: auto;-->*/
  /*<!--}-->*/
  .one {
    margin-left: 5px;
  }
  .control-label{
	flex-basis:100px;
	margin-right:10px
  }
  .btn-search{
	padding-top:0px;
	padding-left:10px;
  }
</style>
