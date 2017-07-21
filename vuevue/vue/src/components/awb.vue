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
                                        Month {{selectedMonth}} :
                                    </label>
                                    <div class="col-sm-2">
                                        <select class="form-control" v-on:change="changeMonth()" v-model="selectedMonth">
                                            <option value="Select Month" disabled="" selected="">
                                                Select Month
                                            </option>
											<!--<option v-for="item of listMonth" v-bind:value="item">{{item}}</option>-->
                                            <option value="January">January</option>
                                            <option value="February">February</option>
                                            <option value="March">March</option>
                                            <option value="April">April</option>
                                            <option value="May">May</option>
                                            <option value="June">June</option>
                                            <option value="July">July</option>
                                            <option value="August">August</option>
                                            <option value="September">September</option>
                                            <option value="October">October</option>
                                            <option value="November">November</option>
                                            <option value="December">December</option>
                                        </select>
                                    </div>
                                    <label class="col-sm-1 control-label">
                                        Logistic :
                                    </label>
                                    <div class="col-sm-2">
                                        <select class="form-control" v-on:change="changeLogistic()" v-model="selectedLogistic">
                                            <option disabled selected value="Select Logistic">Select Logistic</option>
											<option v-for="item of listLogistic" v-bind:value="item">{{item}}</option>
                                        </select>
                                    </div>
                                    <label class="col-sm-2 control-label" for="skill">
                                        AWB :
                                    </label>
                                    <div class="col-sm-2">
                                        <input type="text" placeholder="AWB Number" class="form-control" v-model="AwbNumber" v-on:change="changeAwbNumber()">
                                    </div>
                                    <label class="col-sm-1 control-label" for="skill">
                                        GDN Ref :</label>
                                    <div class="col-sm-1">
                                        <input type="text" placeholder="GDN Ref" class="form-control" v-model="GDNRef" v-on:change="changeAwbNumber()">
                                    </div>
                                </div>
                            </div>
                            <div class="form-horizontal">
                                <div class="form-group">
                                    <label class="col-sm-1 control-label" for="skill">
                                        Year :
                                    </label>
                                    <div class="col-sm-2">
                                        <select id="skill" name="skill" class="form-control" v-on:change="changeYear()" v-model="selectedYear">
                                            <option value="Select Year" disabled="" selected="">
                                                Select year
                                            </option>
                                            <option v-for="item of listYear" v-bind:value="item">{{item}}</option>
                                        </select>
                                    </div>  
                                    <label class="col-sm-1 control-label" for="skill">
                                        Status :
                                    </label>
                                    <div class="col-sm-2">
                                        <select class="form-control" v-on:change="changeStatus()" v-model="selectedStatus">
                                            <option disabled selected value="Select Status">
                                                Select status
                                            </option>
                                            <option value="All">All</option>
                                            <option value="Uploaded">Uploaded</option>
                                            <option value="Done">Done</option>
                                        </select>
                                    </div>      
                                    <label class="col-sm-2 control-label" for="skill">
                                        Merchant Code :
                                    </label>
                                    <div class="col-sm-2">
                                        <input type="text" placeholder="Merchant Code" class="form-control" v-model="MerchantCode" v-on:change="changeMerchantCode()">
                                    </div>                             
                                    <div class="col-sm-1">
                                        <button type="submit" class="btn btn-effect-ripple btn-primary">Search</button>
                                    </div>
                            </div>
                        </div>
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
                            <i class="fa fa-fw ti-menu-alt"></i> List AWB  {{selectedMonth}} - {{month}}
                        </h3>
                        <span class="pull-right">
                            <i class="fa fa-fw ti-angle-up clickable"></i>
                            <!--<i class="fa fa-fw ti-close removepanel clickable"></i>-->
                        </span>
                    </div>
                    <div class="panel-body">
                        <div class="panel-body table-responsive">
                            <table class="table table-striped table-bordered table_width">
                            <thead>
                                <tr>
                                    <th>Month</th>
                                    <th>Year</th>
                                    <th>Logistic</th>
                                    <th>AWB <i class="ti ti-exchange-vertical pull-right"></i></th>
                                    <th>Recon Status <i class="ti ti-exchange-vertical pull-right"></i></th>
                                    <th>Merchant Code</th>
                                    <th>GDN Ref <i class="ti ti-exchange-vertical pull-right"></i></th>
                                </tr>
                            </thead>
                            <tbody>
                             <tr v-for="post of posts" data-toggle="modal" data-target="#form_modal" v-on:click="openModal(post)">
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
						<div class="pull-right" v-if="totalPage>0">
							<ul class="pagination">
								<li v-on:click="toPageOne()" v-if="prevpage+1!=1"><a>1</a></li>
								<li class="disabled" v-if="checkedPrevPage()"><a>...</a></li>
								<li><a v-on:click="fetchPrev()" v-if="prevpage<page">{{prevpage+1}}</a></li>
								<li class="active"><a>{{page+1}}</a></li>
								<li><a v-on:click="fetchNext()" v-if="nextpage+1!=totalPage">{{nextpage+1}}</a></li>
								<li class="disabled" v-if="checkedNextPage()"><a>...</a></li>
								<li><a v-on:click="toLastPage()" v-if="page<nextpage">{{totalPage}}</a></li>
							</ul>
						</div>
						<div id="form_modal" class="modal fade animated" role="dialog">
										<div class="modal-dialog modal-lg">
											<div class="modal-content">
												<div class="modal-header">
													<button type="button" class="close" data-dismiss="modal">&times;</button>
													<h4 class="modal-title">{{title}}</h4>
												</div>
												<form role="form">
												<div class="modal-body">
                                            <div class="row m-t-10 col-md-12">
														<div class="col-md-4">
															<b>Reconciliation Data</b>
														</div>
														<div class="col-md-4">
															<span class="col-md-12"><b>Blibli Data</b></span>
														</div>
														<div class="col-md-4">
															<span class="col-md-12"><b>3PL Data</b></span>
														</div>
														<hr/>
													</div>
													<div class="row m-t-10 col-md-12">
													
														<div class="col-md-4">
															<div class="col-md-7">Failure Reason</div>
															<div class="col-md-5">: {{awb.failure}}</div>
															<div class="col-md-7">Merchant Code</div>
															<div class="col-md-5">: {{awb.merchantCode}}</div>
															<div class="col-md-7">Merchant Name</div>
															<div class="col-md-5">: {{awb.merchantName}}</div>
															<div class="col-md-7">Original Shipping Cost</div>
															<div class="col-md-5">: {{awb.focsAmount}}</div>
															<div class="col-md-7">Adjusment Shipping Cost</div>
															<div class="col-md-5">: {{awb.focsaAmount}}</div>
															<div class="col-md-7">Notes</div>
															<div class="col-md-5">: {{awb.notes}}</div>
														</div>
														<div class="col-md-4">
															<div class="col-md-5">Sender Name</div>
															<div class="col-md-7">: {{awb.namaPengirimAPI}}</div>
															<div class="col-md-5">Sender Address</div>
															<div class="col-md-7">: {{awb.alamatPengirimAPI}}</div>
															<div class="col-md-5">Origin Code</div>
															<div class="col-md-7">: {{awb.kodeOriginAPI}}</div>
															<div class="col-md-5">Receiver Name</div>
															<div class="col-md-7">: {{awb.namaPenerimaAPI}}</div>
															<div class="col-md-5">Receiver Address</div>
															<div class="col-md-7">: {{awb.alamatPenerimaAPI}}</div>
															<div class="col-md-5">Destination Code</div>
															<div class="col-md-7">: {{awb.kodeDestinasiAPI}}</div>
														</div>
														<div class="col-md-4">
															<div class="col-md-5">Sender Name</div>
															<div class="col-md-7">: {{awb.namaPengirimSystem}}</div>
															<div class="col-md-5">Sender Address</div>
															<div class="col-md-7">: {{awb.alamatPengirimSystem}}</div>
															<div class="col-md-5">Origin Code</div>
															<div class="col-md-7">: {{awb.kodeOriginSystem}}</div>
															<div class="col-md-5">Receiver Name</div>
															<div class="col-md-7">: {{awb.namaPenerimaSystem}}</div>
															<div class="col-md-5">Receiver Address</div>
															<div class="col-md-7">: {{awb.alamatPenerimaSystem}}</div>
															<div class="col-md-5">Destination Code</div>
															<div class="col-md-7">: {{awb.kodeDestinasiSystem}}</div>
														</div>
													</div>
													<div class="row m-t-10 col-md-12">
														<span class="col-md-12"><hr/></span>
														<span class="col-md-12"><h3>Charge Summary</b></h3></span>
														<span class="col-md-12"><hr/></span>
														<div class="table-responsive col-md-12">
														<table class="table" id="table1">
														<thead>
															<tr>
															  <th></th>
															  <th>Weight</th>
															  <th>Price/Kg</th>
															  <th>Other Charge</th>
															  <th>Gift Wrap Charge</th>
															  <th>Insurance Charge</th>
															  <th>Total Charge</th>
															</tr>
														</thead>
														<tbody>
															<tr>
															  <th>System</th>
															  <td>{{awb.weightSystem}}</td>
															  <td>{{awb.priceSystem}}</td>
															  <td>{{awb.otherChargeSystem}}</td>
															  <td>{{awb.giftWrapChargeSystem}}</td>
															  <td>{{awb.insuranceChargeSystem}}</td>
															  <td>{{awb.totalChargeSystem}}</td>
															</tr>
															<tr>
															  <th>Logistic</th>
															  <td>{{awb.weightLogistic}}</td>
															  <td>{{awb.priceLogistic}}</td>
															  <td>{{awb.otherChargeLogistic}}</td>
															  <td>{{awb.giftWrapChargeLogistic}}</td>
															  <td>{{awb.insuranceChargeLogistic}}</td>
															  <td>{{awb.totalChargeLogistic}}</td>
															</tr>
															<tr>
															  <th>Applied</th>
															  <td>{{awb.weightApplied}}</td>
															  <td>{{awb.priceApplied}}</td>
															  <td>{{awb.otherChargeApplied}}</td>
															  <td>{{awb.giftWrapChargeApplied}}</td>
															  <td>{{awb.insuranceChargeApplied}}</td>
															  <td>{{awb.totalChargeApplied}}</td>
															</tr>
															<tr>
															  <th>Comment</th>
															  <td>{{awb.weightComment}}</td>
															  <td>{{awb.priceComment}}</td>
															  <td>{{awb.otherChargeComment}}</td>
															  <td>{{awb.giftWrapChargeComment}}</td>
															  <td>{{awb.insuranceChargeComment}}</td>
															  <td>{{awb.totalChargeComment}}</td>
															</tr>
															</tbody>
														  </table>
														</div>
													</div>
                                            <div class="row m-t-10">
                                                
                                            </div>
                                        </div>
													<div class="modal-footer">
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
	props: {
      month: {
      type: String,
      default: 'Vue!'
		},
		year: {
      type: String,
      default: 'Vue!'
		},
		logistic: {
      type: String,
      default: 'Vue!'
		}
    },
    data: () => ({
      posts: [],
      uploadedFiles: [],
      uploadError: null,
      currentStatus: null,
      uploadFieldName: 'invoiceFile',
      selectedMonth: 'Select Month',
      selectedLogistic: 'Select Logistic',
      selectedYear: 'Select Year',
        selectedStatus: 'Select Status',
        MerchantCode: '',
        AwbNumber: '',
        GDNRef: '',
		test: '',
		title: '',
		awb: [],
		cek: '',
		listLogistic: [],
		listYear: [],
		listMonth: [],
    page: 0,
    size: 10,
    nextpage: 0,
    prevpage: 0,
    totalPage: 0,
    Pages: [],
	filter: 'none'
    }),
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
			this.fetchNext()
    },
    destroyed: function() {
    },
  methods: { 
	  /*setFilter(){
		if(this.filter==='none'){
		
		}
		else if(this.filter==='month'){
		
		}
		else if(this.filter==='year'){
		
		}
		else if(this.filter==='logistic'){
		
		}
		else if(this.filter==='status'){
		
		}
		else if(this.filter==='awb'){
		
		}
		else if(this.filter==='merchantcode'){
		
		}
		else if(this.filter==='gdnref'){
		
		}
		else if(this.filter==='full'){
		
		}
		else if(this.filter==='invoice'){
		
		}
	  },*/
      changeStatus () {
        axios.get('http://127.0.0.1:8091/api/awb/filterstatus/' + this.selectedStatus)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },

      changeMonth () {
		
        axios.get('http://127.0.0.1:8091/api/awb/filtermonth/' + this.selectedMonth)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
			//this.fetchPages()
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
	  toPageOne(){
		this.nextpage=0
		this.prevpage=0
		this.page=0
		this.fetchNext()
	  },
      fetchPrev () {
          axios.get('http://127.0.0.1:8091/api/awb/awbs?page='+ this.prevpage+'&size='+this.size)
              .then(response => {
                  // JSON responses are automatically parsed.
                  this.posts = response.data.content
                  this.fetchPages()
              })
              .catch(e => {
                  this.errors.push(e)
              })

      },
      filterAll () {
        axios.get('http://127.0.0.1:8091/api/awb/filter/' + this.selectedMonth + '/' + this.selectedYear + '/' + this.selectedLogistic + '/' + this.AwbNumber + '/' + this.selectedStatus + '/' + this.merchantCode + '/' + this.gdnRef)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
	  filterByInvoice () {
        axios.get('http://127.0.0.1:8091/api/awb/filterinvoice/' + this.selectedMonth + '/' + this.selectedYear + '/' + this.logistic)
          .then(response => {
            // JSON responses are automatically parsed.
            
			this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
	  toLastPage(){
		this.nextpage=this.totalPage-1
		this.fetchNext()
	  },
	  fetchNext () {
		axios.get('http://127.0.0.1:8091/api/awb/awbs?page='+ this.nextpage+'&size='+this.size)
        .then(response => {
          // JSON responses are automatically parsed.
          this.posts = response.data.content
//            if(this.nextpage+1<this.totalPage) {
//                this.nextpage = this.nextpage + 1
//            }
            this.fetchPages()
        })
        .catch(e => {
          this.errors.push(e)
        })
	  },
      fetchPages () {
          axios.get(`http://127.0.0.1:8091/api/awb/awbnumbers`)
              .then(response => {
                  // JSON responses are automatically parsed.
                  this.page = response.data.page
                  this.totalPage = response.data.total_page
                  this.nextpage=this.page
                  this.prevpage=this.page
                  if(this.nextpage+1<this.totalPage) {
                      this.nextpage = this.nextpage + 1
                  }
                  if(this.prevpage-1>=0) {
                      this.prevpage = this.prevpage - 1
                  }
              })
              .catch(e => {
                  this.errors.push(e)
              })
      },
	  openModal(obj){
		  this.awb=obj
		  this.title=this.awb.awbNumber + ' / ' + this.awb.gdnRef + ' (' + this.awb.reconStatus + ') '
	  },
	  getLogisticSelectList(){
		axios.get('http://127.0.0.1:8091/api/logistic/list')
          .then(response => {
            // JSON responses are automatically parsed.
            this.listLogistic = response.data
			if(this.logistic==='Vue!'){
			
			}
			else{
				this.selectedLogistic=this.logistic
			}
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
	  checkedNextPage(){
		return this.nextpage+2!=this.totalPage && this.nextpage+1!=this.totalPage
	  },
	  checkedPrevPage(){
		return this.prevpage!=0 && this.prevpage-1!=0
	  }
    },
    ready() {
        this.uploadHistory();
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
            /*var table = $('#example').DataTable({
                "responsive": true
            });*/
            $('button.toggle-vis').on('click', function(e) {
                e.preventDefault();
                // Get the column API object
                var column = table.column($(this).attr('data-column'));
                // Toggle the visibility
                column.visible(!column.visible());
            });
        },500);
        });
		
		if(this.month==='Vue!' || this.year==='Vue!' || this.logistic==='Vue!'){
			this.fetchNext()
			this.filter='haha'
		}
        else{
		this.filter='hihi'
			this.selectedMonth=this.month
			this.selectedYear=this.year
			this.filterByInvoice()
			
		}
		this.getLogisticSelectList()
		this.getYearSelectList()
		document.getElementById('awb').classList.add('active');
		
      }
}
</script>
<style src="../vendors/bootstrap-fileinput/css/fileinput.min.css"></style>
<style src="../assets/css/formelements.css"></style>
<style>
   .tablemodal {
    margin-left: 27%;
}
.toleft {
    margin-left: 15%;
}
.one {
    margin-left: 5px;
  }
  .modal-title-margin{
	margin-top:30px !important;
  }
</style>
