<template>
  <!-- Main content -->
  <section class="content">
    <!-- Main row -->
    <div class="row">
      <div class="col-md-12 ">
	  
        <!-- Horizontal Form -->
        <!-- /.box-header -->
        <!-- form start -->
        <div class="form-horizontal">
<div class="box-body">
		<label for="exampleInputEmail1 " class=" control-label col-md-1">Month</label>
		<div class="col-md-2">
			<select v-on:change="changeMonth()" v-model="selectedMonth" class="form-control">
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
		<label for="exampleInputEmail1 " class=" control-label col-md-1">Year</label>
		<div class="col-md-2">
			<select v-on:change="changeYear()" v-model="selectedYear" class="form-control">
				<option>2017</option>
				<option>2018</option>
			</select>
		</div>
		<label for="exampleInputEmail1 " class=" control-label col-md-1">Logistic</label>
		<div class="col-md-2">
			<select v-on:change="changeLogistic()" v-model="selectedLogistic" class="form-control">
				<option value="A Logistic">A Logistic</option>
				<option value="B Logistic">B Logistic</option>
				<option value="C Logistic">C Logistic</option>
				<option value="D Logistic">D Logistic</option>
			</select>
		</div>
		<div class="col-md-3">
			<button type="submit" class="btn btn-info ">Search</button>
			<a class="btn btn-info" data-toggle="modal" data-target="#modal-default">Upload</a>
		</div>
</div>
</div>
        <!--<button type="button" class="btn btn-default" data-toggle="modal" data-target="#modal-default">
          Launch Default Modal
        </button>-->
		
        <div class="modal fade" id="modal-default">
          <form class="form">
            <div class="modal-dialog">
              <div class="modal-content satu">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span></button>
                  <h4 class="modal-title">Default Modal</h4>
                </div>

                <div class="modal-body">

                  <!--<h1 class="title">Upload Invoice</h1>-->
                  <div class="block ">
                    <form enctype="multipart/form-data">
                      <table class="tablemodal" >
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
                </div>
              </div>
              <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
          </form>
        </div>


        <div class="box box-info">
          <div class="box-header with-border">
            <h3 class="box-title">Summary - Invoice A Logistic / January / 2017</h3>
          </div>
		  
          <!-- /.box-header -->
          <!-- form start -->
          <div class="box-body table-responsive ">
            <div class="col-md-12">
				<div class="col-md-3">
					<label>OK  : 298527 data</label>
				</div>
				<div class="col-md-3">
					<label>Problem Exist   : 219 data</label>
				</div>
				<div class="col-md-3">
					<label>Status  : Open</label>
				</div>
				<div class="col-md-3">
					<label>Jumlah Tagihan   : Rp.xx.xxx.xxx</label>
				</div>
				<div class="col-md-6 pull-left">
					<button type="submit" class="btn btn-info">View Data</button>
					<button type="submit" class="btn btn-info">Download</button>
				</div>
				<div class="col-md-6 text-right">
					<button type="submit" class="btn btn-info">Submit</button>
					<button type="submit" class="btn btn-info">Approve</button>
				</div>
			</div>
          </div>
        </div>

        <div class="box">
          <div class="box-header with-border">
            <h3 class="box-title">Upload History {{error}}</h3>
          </div>
          <!-- /.box-header -->
          <div class="box-body">
            <div class="dataTables_wrapper form-inline dt-bootstrap" id="example1_wrapper">
              <div class="row">
                <div class="col-sm-6">
                  <div id="example1_length" class="dataTables_length">
                  </div>
                </div>
              </div>

              <div class="row">
                <div class="col-sm-12 table-responsive">
                  <table aria-describedby="example1_info" role="grid" id="example1"
                         class="table table-bordered table-striped dataTable">
                    <thead>
                    <tr role="row">
                      <th aria-label="Month: activate to sort column descending" aria-sort="ascending"
                          style="width: 167px;" colspan="1" rowspan="1" aria-controls="example1" tabindex="0"
                          class="sorting_asc">Month
                      </th>
                      <th aria-label="Year: activate to sort column ascending" style="width: 207px;" colspan="1"
                          rowspan="1" aria-controls="example1" tabindex="0" class="sorting">Year
                      </th>
                      <th aria-label="OK: activate to sort column ascending" style="width: 182px;" colspan="1"
                          rowspan="1" aria-controls="example1" tabindex="0" class="sorting">OK
                      </th>
                      <th aria-label="Problem Exist: activate to sort column ascending" style="width: 142px;"
                          colspan="1" rowspan="1" aria-controls="example1" tabindex="0" class="sorting">Problem Exist
                      </th>
                      <th aria-label="Jumlah Tagihan: activate to sort column ascending" style="width: 101px;"
                          colspan="1" rowspan="1" aria-controls="example1" tabindex="0" class="sorting">Jumlah Tagihan
                      </th>
                      <th aria-label="Logistic: activate to sort column ascending" style="width: 182px;" colspan="1"
                          rowspan="1" aria-controls="example1" tabindex="0" class="sorting">Logistic
                      </th>
                      <th aria-label="Status: activate to sort column ascending" style="width: 182px;" colspan="1"
                          rowspan="1" aria-controls="example1" tabindex="0" class="sorting">Status
                      </th>
                      <th aria-label="Last Modified: activate to sort column ascending" style="width: 182px;"
                          colspan="1" rowspan="1" aria-controls="example1" tabindex="0" class="sorting">Last Modified
                      </th>
                    </tr>
                    </thead>
                    <tbody>
					<tr v-for="post of posts" role="row">
                <td class="sorting_1">{{post.month}}</td>
                <td>{{post.year}}</td>
                <td>{{post.ok}}</td>
                <td>{{post.problemExist}}</td>
                <td>{{post.jumlahTagihan}}</td>
                <td>{{post.logistic}}</td>
                <td>{{post.status}}</td>
                <td>{{post.last_modified}}</td>
              </tr>
                    <tr class="even" role="row">
                      <td class="sorting_1">January</td>
                      <td>2017</td>
                      <td>297227</td>
                      <td>3000</td>
                      <td>Rp.xx.xxx.xxx</td>
                      <td>A</td>
                      <td>Done</td>
                      <td>03 February 2017</td>
                    </tr>
                    <tr class="odd" role="row">
                      <td class="sorting_1">January</td>
                      <td>2017</td>
                      <td>300</td>
                      <td>10</td>
                      <td>Rp.xx.xxx.xxx</td>
                      <td>A</td>
                      <td>Done</td>
                      <td>09 February 2017</td>
                    </tr>
                    <tr class="even" role="row">
                      <td class="sorting_1">January</td>
                      <td>2017</td>
                      <td>1000</td>
                      <td>141</td>
                      <td>Rp.xx.xxx.xxx</td>
                      <td>A</td>
                      <td>Done</td>
                      <td>27 February 2017</td>
                    </tr>

                    </tbody>
                    <!--<tfoot>-->
                    <!--<tr>-->
                    <!--<th colspan="1" rowspan="1">Rendering engine</th>-->
                    <!--<th colspan="1" rowspan="1">Browser</th>-->
                    <!--<th colspan="1" rowspan="1">Platform(s)</th>-->
                    <!--<th colspan="1" rowspan="1">Engine version</th>-->
                    <!--<th colspan="1" rowspan="1">CSS grade</th>-->
                    <!--</tr>-->
                    <!--</tfoot>-->
                  </table>
                </div>
              </div>
            </div>
            <!-- /.box-body -->
          </div>
        </div>
      </div>
    </div>

    <!-- /.row -->
  </section>
  <!-- /.content -->
</template>

<script>
  import $ from 'jquery'
  // Require needed datatables modules
  import 'datatables.net'
  import 'datatables.net-bs'
  import axios from 'axios'

  export default {
    name: 'Tables',
    mounted () {
      this.$nextTick(() => {
        $('#example1').DataTable()
      })
      this.init()
    },
    data () {
      return {
        uploadedFiles: [],
        uploadError: null,
        currentStatus: null,
        uploadFieldName: 'invoiceFile',
        selectedMonth: 'January',
        selectedLogistic: 'A Logistic',
        posts: [],
        error: ''
      }
    },

    methods: {
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
      },
      init () {
        axios.get(`http://127.0.0.1:8080/api/uploadHistory`)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.error = e
          })
      }
    }
  }
</script>
<style>
  .info-box {
    cursor: pointer;
  }

  .info-box-content {
    text-align: center;
    vertical-align: middle;
    display: inherit;
  }

  .fullCanvas {
    width: 100%;
  }

  .col-sm-1 {
    padding-left: 0px;
    position: relative;
    padding-right: 0px;
  }

  .selectoption {
    width: 100px;
    position: relative;
    padding-left: 0px;
    padding-right: 0px;
  }

  .controlleft {
  }
  .one {
    margin-left: 5px;
  }
</style>
