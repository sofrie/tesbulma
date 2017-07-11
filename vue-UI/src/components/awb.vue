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
                                        <select id="skill" name="skill" class="form-control" v-on:change="changeMonth()" v-model="selectedMonth">
                                            <option value="" disabled="" selected="">
                                                Select month
                                            </option>
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
                                    <label class="col-sm-1 control-label" for="skill">
                                        Logistic :
                                    </label>
                                    <div class="col-sm-2">
                                        <select id="skill" name="skill" class="form-control" v-on:change="changeLogistic()" v-model="selectedLogistic">
                                            <option value="" disabled="" selected="">
                                                Select logistic
                                            </option>
                                            <option value="A Logistic">A Logistic</option>
                                            <option value="B Logistic">B Logistic</option>
                                            <option value="C Logistic">C Logistic</option>
                                            <option value="D Logistic">D Logistic</option>
                                        </select>
                                    </div>
                                    <label class="col-sm-1 control-label" for="skill">
                                        AWB :
                                    </label>
                                    <div class="col-sm-2">
                                        <input type="text" placeholder="AWB Number" class="form-control" v-model="AwbNumber" v-on:change="changeAwbNumber()">
                                    </div>
                                    <label class="col-sm-1 control-label" for="skill">
                                        GDN Ref :</label>
                                    <div class="col-sm-2">
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
                                            <option value="" disabled="" selected="">
                                                Select year
                                            </option>
                                            <option value="2017">2017</option>
                                            <option value="2018">2018</option>
                                        </select>
                                    </div>  
                                    <label class="col-sm-1 control-label" for="skill">
                                        Status :
                                    </label>
                                    <div class="col-sm-2">
                                        <select id="skill" name="skill" class="form-control" v-on:change="changeStatus()" v-model="selectedStatus">
                                            <option value="" disabled="" selected="">
                                                Select status
                                            </option>
                                            <option value="All">All</option>
                                            <option value="Uploaded">Uploaded</option>
                                            <option value="Done">Done</option>
                                        </select>
                                    </div>      
                                    <label class="col-sm-1 control-label" for="skill">
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
            <div class="panel">
                <div class="panel-heading">
                    <h1 class="panel-title">
                        <i class="fa fa-fw ti-move"></i> Summary - Invoice A Logistic / January / 2017
                    </h1>
                    <span class="pull-right">
                        <i class="fa fa-fw ti-angle-up clickable"></i>
                        <i class="fa fa-fw ti-close removepanel clickable"></i>
                    </span>
                </div>
                <div class="panel-body">
                    <div class="col-sm-3">
                        <label>
                            OK : 298527 data
                        </label>
                    </div>
                    <div class="col-sm-3">
                        <label>
                            Problem Exist : 219 data
                        </label>
                    </div>
                    <div class="col-sm-3">
                        <label>
                            Status:Open
                        </label>
                    </div>
                    <div class="col-sm-3">
                        <label>
                            Jumlah Tagihan:Rp.xx.xxx
                        </label>
                    </div>
                    <button class="btn btn-primary button_normal">View Data</button>
                    <button class="btn btn-primary button_normal">Download</button>
                    <button class="btn btn-primary button_normal pull-right one">Approve</button>
                    <button class="btn btn-primary button_normal pull-right">Submit</button>
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
                            <i class="fa fa-fw ti-close removepanel clickable"></i>
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
                             <!-- <tr v-for="post of posts" >
                                <td>{{post.month}}</td>
                                <td>{{post.year}}</td>
                                <td>{{post.ok}}</td>
                                <td>{{post.problemExist}}</td>
                                <td>{{post.jumlahTagihan}}</td>
                                <td>{{post.logistic}}</td>
                                <td>{{post.status}}</td>
                                <td>{{post.last_modified}}</td>
                              </tr>    -->                             
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
      selectedMonth: 'January',
      selectedLogistic: 'A Logistic',
      selectedYear: '2017',
        selectedStatus: 'All',
        MerchantCode: '',
        AwbNumber: '',
        GDNRef: ''
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
</style>
