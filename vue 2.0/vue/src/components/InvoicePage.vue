<template>
    <div>
        <div class="row">
            <div class="col-md-12">
                <div>
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="form-horizontal">
                                <div class="form-group">
                                    <label class="col-sm-1 control-label" for="skill">
                                        Month :
                                    </label>
                                    <div class="col-sm-2">
                                        <select id="skill" name="skill" class="form-control" v-on:change="changeMonth()" v-model="selectedSearchMonth">
                                            <option value="Select Month" disabled="" selected="">
                                                Select month
                                            </option>
                                            <!--<option v-for="item of listMonth" v-bind:value="item">{{item}}</option>-->
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
                                    <label class="col-sm-1 control-label" for="skill">
                                        Year :
                                    </label>
                                    <div class="col-sm-2">
                                        <select id="skill" name="skill" class="form-control" v-on:change="changeYear()" v-model="selectedSearchYear">
                                            <option value="Select Year" disabled="" selected="">
                                                Select Year
                                            </option>
                                            <option v-for="item of listYear" v-bind:value="item">{{item}}</option>
                                        </select>
                                    </div>
                                    <label class="col-sm-1 control-label" for="skill">
                                        Logistic :
                                    </label>
                                    <div class="col-sm-2">
                                        <select id="skill" name="skill" class="form-control" v-on:change="changeLogistic()" v-model="selectedSearchLogistic">
                                            <option value="Select Logistic" disabled="" selected="">
                                                Select logistic
                                            </option>
                                            <option v-for="item of listLogistic" v-bind:value="item">{{item}}</option>
                                        </select>
                                    </div>
                                    <div class="col-sm-1">
                                        <button type="submit" class="btn btn-effect-ripple btn-primary">Search</button>
                                    </div>
                                    <div class="col-sm-1">
                                        <button type="submit" class="btn btn-effect-ripple btn-primary" data-toggle="modal" data-target="#form_modal">
                                            Upload
                                        </button>
                                        <div id="form_modal" class="modal fade animated" role="dialog">
										<div class="modal-dialog">
											<div class="modal-content">
												<div class="modal-header">
													<button type="button" class="close" data-dismiss="modal">&times;</button>
													<h4 class="modal-title">Upload Invoice</h4>
												</div>
												<form role="form">
													<div class="modal-body">
													<div class="row m-t-10 form-group">
														<label for="input-text" class="col-sm-2 control-label">Month</label>
														<div class="col-sm-10">
															<select id="select-gear" v-model="selectedMonth" class="form-control">
																<option value="" disabled="" selected="" >
																	Select month
																</option>
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
													<div class="row m-t-10 form-group">
														<label for="input-text" class="col-sm-2 control-label">Year</label>
														<div class="col-sm-10">
															<select id="select-gear" v-model="selectedYear" class="form-control">
																<option value="" disabled="" selected="">
																	Select year
																</option>
																
																<option v-for="item of listYear" v-bind:value="item">{{item}}</option>
															</select>
														</div>
													</div>
													<div class="row m-t-10 form-group">
														<label for="input-text" class="col-sm-2 control-label">Logistic</label>
														<div class="col-sm-10">
															<select id="select-gear" v-model="selectedLogistic" class="form-control">
																<option value="" disabled="" selected="">
																	Select logistic
																</option>
																<option v-for="item of listLogistic" v-bind:value="item">{{item}}</option>
															</select>
														</div>
													</div>
													<div class="row m-t-10 form-group">
														<label for="input-text" class="col-sm-2 control-label">File</label>
															<div class="col-sm-10">
																<input type="file" :name="uploadFieldName" :disabled="isSaving" @change="filesChange($event.target.name, $event.target.files); fileCount = $event.target.files.length" class="input-file">
															</div>
													</div>
													</div>
													<div class="modal-footer">
														<button type="submit" class="btn btn-succes" v-on:click="uploadHistory()" data-dismiss="modal">Submit</button>
														<button type="reset" class="btn btn-default">Reset</button>
														<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
													</div>
												</form>
											</div>
										</div>
									</div>
								</div>
                            </div>
                        </div>
                    </div>
                </div>                
            </div>
            <div class="panel" v-if="invoice">
                <div class="panel-heading">
                    <h1 class="panel-title">
                        <i class="fa fa-fw ti-move"></i> Summary - Invoice {{invoice.logistic}} / {{invoice.month}} / {{invoice.year}}
                    </h1>
                    <span class="pull-right">
                        <i class="fa fa-fw ti-angle-up clickable"></i>
                        <!--<i class="fa fa-fw ti-close removepanel clickable"></i>-->
                    </span>
                </div>
                <div class="panel-body">
					<div class="col-sm-12 m-t-10">
						<div class="col-sm-3">
							<label>
								OK : {{invoice.ok}} data
							</label>
						</div>
						<div class="col-sm-3">
							<label>
								Problem Exist : {{invoice.problemExist}} data
							</label>
						</div>
						<div class="col-sm-3">
							<label>
								Status: {{invoice.status}}
							</label>
						</div>
						<div class="col-sm-3">
							<label>
								Jumlah Tagihan:Rp. {{invoice.jumlahTagihan}}
							</label>
						</div>
					</div>
					<div class="col-sm-12 m-t-10">
						<router-link :to="{path:'/awb/'+invoice.month+'/'+invoice.year+'/'+invoice.logistic}">
							<button class="btn btn-primary button_normal">View Data</button>
						</router-link>
						
						<button class="btn btn-primary button_normal">Download</button>
						<button class="btn btn-primary button_normal pull-right">Approve</button>
						<button class="btn btn-primary button_normal pull-right" v-on:click="uploaded()">Submit</button>
					</div>
                </div>
            </div>
        </div>
    </div>
        <div class="row">
            <div class="col-md-12">
                <div class="panel ">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                            <i class="fa fa-fw ti-download"></i> Upload History
                        </h3>
                        <span class="pull-right">
                            <i class="fa fa-fw ti-angle-up clickable"></i>
                            <!--<i class="fa fa-fw ti-close removepanel clickable"></i>-->
                        </span>
                    </div>
                    <div class="panel-body">
                        <div class="panel-body table-responsive">
                            <table class="table table-striped table-bordered table_width" id="example">
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
                             <tr v-for="post of posts" v-on:click="setSummary(post)">
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
                    </div>
                </div>
            </div>
        </div>
        <!--main content ends-->
    </div>
</template>
<script>
import fileinput from "../vendors/bootstrap-fileinput/js/fileinput.min.js"
import localforage from 'localforage'
import { upload } from './file-upload.service.js'
import axios from 'axios'
import dt from "datatables.net";
import datatables_bootstrap from "datatables.net-bs/js/dataTables.bootstrap.js";
require("datatables.net-bs/css/dataTables.bootstrap.css");

const STATUS_INITIAL = 0
const STATUS_SAVING = 1
const STATUS_SUCCESS = 2
const STATUS_FAILED = 3
const formData = new window.FormData()
export default {
    name: "datatables",
    data: () => ({
      posts: [],
      uploadedFiles: [],
      uploadError: null,
      currentStatus: null,
      uploadFieldName: 'invoiceFile',
      selectedMonth: 'Select Month',
      selectedLogistic: 'Select Logistic',
      selectedYear: 'Select Year',
	  selectedSearchMonth: 'Select Month',
      selectedSearchLogistic: 'Select Logistic',
      selectedSearchYear: 'Select Year',
	  invoice: null,
	  listMonth: [],
      listLogistic: [],
      listYear: [],
		x: 0,
		i: 0
    }
    ),
    mounted: function() {
        "use strict";        
        $(".content .row").find('input').iCheck({
                checkboxClass: 'icheckbox_square-blue',
                radioClass: 'iradio_square-blue',
            increaseArea: '20%' // optional
        });
            $("#input-43").fileinput({
                browseClass: "btn btn-info",
                showPreview: false,
                allowedFileExtensions: ["zip", "rar", "gz", "tgz"],
                elErrorContainer: "#errorBlock43"
                // you can configure `msgErrorClass` and `msgInvalidFileExtension` as well
            });
            $("#input-42").fileinput({
                browseClass: "btn btn-warning",
                maxFilesNum: 10,
                allowedFileExtensions: ["jpg", "gif", "png", "txt"]
            });
            $("#input-41").fileinput({
                browseClass: "btn btn-danger",
                maxFileCount: 10,
                allowedFileTypes: ["image", "video"]
            });
            $("#input-40,#input-22").fileinput("enable");
            $(".btn-modify").on("click", function() {

                var $btn = $(this);
                if ($btn.text() == "Modify") {
                    $("#input-40").fileinput("disable");
                    $btn.html("Revert");
                    alert("Hurray! I have disabled the input and hidden the upload button.");
                } else {
                    $("#input-40").fileinput("enable");
                    $btn.html("Modify");
                    alert("Hurray! I have reverted back the input to enabled with the upload button.");
                }
            });
            $("#input-23").fileinput({
                browseClass: "btn btn-default",
                showUpload: false,
                mainTemplate: "{preview}\n" +
                "<div class='input-group {class}'>\n" +
                "   <div class='input-group-btn'>\n" +
                "       {browse}\n" +
                "       {upload}\n" +
                "       {remove}\n" +
                "   </div>\n" +
                "   {caption}\n" +
                "</div>"
            });
            $("#input-21").fileinput({
                previewFileType: "image",
                browseClass: "btn btn-success",
                browseLabel: " Pick Image",
                browseIcon: '<i class="glyphicon glyphicon-picture"></i>',
                removeClass: "btn btn-danger",
                removeLabel: "Delete",
                removeIcon: '<i class="glyphicon glyphicon-trash"></i>',
                uploadClass: "btn btn-info",
                uploadLabel: " Upload",
                uploadIcon: '<i class="glyphicon glyphicon-upload"></i>',
            });
            $("#input-20").fileinput({
                browseClass: "btn btn-info btn-block",
                showCaption: false,
                showRemove: false,
                showUpload: false
            });
            $("#input-4").fileinput({
                browseClass: "btn btn-success",
                showCaption: false
            });
            $("#input-5").fileinput({
                browseClass: "btn btn-warning",
                showUpload: false,
                maxFileCount: 10,
                mainClass: "input-group-lg"
            });
    },
    destroyed: function() {
    },
  methods: {
    uploadHistory () {
        axios.post(`http://127.0.0.1:8091/api/uploadHistory`, {
          month: this.selectedMonth,
          year: this.selectedYear,
          logistic: this.selectedLogistic
      })
    this.save(formData)
    setTimeout(this.fetchUsers, 5000);
    },
    fetchUsers() {
        axios.get(`http://127.0.0.1:8091/api/uploadHistory`)
        .then(response => {
          // JSON responses are automatically parsed.
          this.posts = response.data
		  this.invoice=this.posts[0]
		  this.getMonthSelectList()
		  this.getYearSelectList()
		  this.getLogisticSelectList()
        })
        .catch(e => {
          this.errors.push(e)
        })      
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
        this.fetchUsers()
    },
    filesChange (fieldName, fileList) {
        // handle file changes
        if (!fileList.length) return
        // append the files to FormData
        Array
        .from(Array(fileList.length).keys())
        .map(x => {
            formData.append(fieldName, fileList[x], fileList[x].name)
        })
        },
        changeMonth () {
        axios.get('http://127.0.0.1:8091/api/uploadHistory/month/' + this.selectedSearchMonth)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
      changeYear () {
        axios.get('http://127.0.0.1:8091/api/uploadHistory/year/' + this.selectedSearchYear)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
      changeLogistic () {
        axios.get('http://127.0.0.1:8091/api/uploadHistory/logistic/' + this.selectedSearchLogistic)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
	  setSummary(obj){
		this.invoice=obj
	  },
	  getMonthSelectList(){
		axios.get('http://127.0.0.1:8091/api/uploadHistory/list/month')
          .then(response => {
            // JSON responses are automatically parsed.
            this.listMonth = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
	  },
	  getYearSelectList(){
		var year=new Date().getFullYear();
		  var yearinit=year-4;
		  var x=0;
		  var i=yearinit;
		  var years=[];
		  for(i=yearinit; i<=year; i+=1){
			years[x]=i;
			x++;
		  }
		  this.listYear=years;
	  },
	  getLogisticSelectList(){
		axios.get('http://127.0.0.1:8091/api/logistic/list')
          .then(response => {
            // JSON responses are automatically parsed.
            this.listLogistic = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
	  }
    },
    ready() {
        this.fetchUsers();
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
    mounted () {
        $(document).ready(function() {
        setTimeout(function(){
            $('#sample_1').dataTable({
                "responsive": true
            });
            var table = $('#example').DataTable({
                "responsive": true
            });
            $('button.toggle-vis').on('click', function(e) {
                e.preventDefault();
                // Get the column API object
                var column = table.column($(this).attr('data-column'));
                // Toggle the visibility
                column.visible(!column.visible());
            });
        },400);
        });
        this.fetchUsers()
		selectedMonth: 'Select Month'
      selectedLogistic: 'Select Logistic'
      selectedYear: 'Select Year'
	  selectedSearchMonth: 'Select Month'
      selectedSearchLogistic: 'Select Logistic'
      selectedSearchYear: 'Select Year'
	  this.getYearSelectList()
      }
}
</script>
<style src="../vendors/bootstrap-fileinput/css/fileinput.min.css"></style>
<style src="../assets/css/formelements.css"></style>
