<template>
  <card-modal :visible="visible" @close="close" :title="title" transition="zoom" class="classmodalleft">
    <div class="tile is-parent">
      <article class="tile is-child box ">

        <!--<h1 class="title">Upload Invoice</h1>-->

        <div class="block ">
          <form enctype="multipart/form-data">
          <table class="tablemodal" id="uploadmodal" >
            <tr>
              <td>{{selectedMonth}}</td>
              <td>
              <span class="select">
                <select v-model="selectedMonth">
                  <option value="January">January</option>
                  <option value="February">Februari</option>
                </select>
              </span>
              </td>
            </tr>
            <tr>
              <td>Year </td>
              <td>
              <span class="select">
                <select>
                  <option>2017</option>
                </select>
              </span>
              </td>
            </tr>
            <tr>
              <td>{{selectedLogistic}} </td>
              <td>
              <span class="select">
                <select v-model="selectedLogistic">
                  <option value="A Logistic">A Logistic</option>
                  <option value="B Logistic">B Logistic</option>
                  <option value="C Logistic">C Logistic</option>
                </select>
              </span>
              </td>
            </tr>
            <tr>
              <td>File</td>
              <td>
                <input type="file" :name="uploadFieldName" :disabled="isSaving" @change="filesChange($event.target.name, $event.target.files); fileCount = $event.target.files.length" class="input-file">
              </td>
            </tr>
            <tr>
            </tr>
            <tr>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td colspan="2" class="centerbutton">
                <button class="button is-info " v-on:click="uploadHistory()">Submit Upload</button>
              </td>
            </tr>
          </table>
          </form>
        </div>

      </article>
    </div>
  </card-modal>
</template>

<script>
  import { CardModal } from 'vue-bulma-modal'
  import localforage from 'localforage'
  import { upload } from './file-upload.service'
  import axios from 'axios'

  const STATUS_INITIAL = 0
  const STATUS_SAVING = 1
  const STATUS_SUCCESS = 2
  const STATUS_FAILED = 3

  localforage.config({
    name: 'budgeterbium'
  })

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
        uploadedFiles: [],
        uploadError: null,
        currentStatus: null,
        uploadFieldName: 'invoiceFile',
        selectedMonth: 'January',
        selectedLogistic: 'A Logistic'
      }
    },
    computed: {
      isInitial () {
        return this.currentStatus === STATUS_INITIAL
      },
      isSaving () {
        return this.currentStatus === STATUS_SAVING
      },
      isSuccess () {
        return this.currentStatus === STATUS_SUCCESS
      },
      isFailed () {
        return this.currentStatus === STATUS_FAILED
      }
    },
    methods: {
      uploadHistory () {
        axios.post(`http://127.0.0.1:8080/api/uploadHistory`, {
          month: this.selectedMonth,
          year: '2017',
          logistic: this.selectedLogistic
        })
      },
      open (url) {
        window.open(url)
      },

      close () {
        this.$emit('close')
      },
      reset () {
        // reset form to initial state
        this.currentStatus = STATUS_INITIAL
        this.uploadedFiles = []
        this.uploadError = null
      },
      save (formData) {
        // upload data to the server
        this.currentStatus = STATUS_SAVING

        upload(formData)
          .then(x => {
            this.uploadedFiles = [].concat(x)
            this.currentStatus = STATUS_SUCCESS
          })
          .catch(err => {
            this.uploadError = err.response
            this.currentStatus = STATUS_FAILED
          })
      },
      filesChange (fieldName, fileList) {
        // handle file changes
        const formData = new window.FormData()

        if (!fileList.length) return

        // append the files to FormData
        Array
          .from(Array(fileList.length).keys())
          .map(x => {
            formData.append(fieldName, fileList[x], fileList[x].name)
          })
        // save it
        this.save(formData)
      },
      mounted () {
        this.reset()
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
    
  }
  .modal-card-foot {
    display:none;
  }
  #uploadmodal.tablemodal {
    margin-left: 27%;
    width: 80%;
  }
  #uploadmodal.tablemodal tr td{
    width:0;
  }
  .centerbutton {
    padding-left: 10%;
  }
  .modal-card-body{
  border-bottom-left-radius: 5px;
    border-bottom-right-radius: 5px;
  }
</style>
