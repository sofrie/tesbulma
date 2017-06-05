<template>
  <!-- Main content -->
  <section class="content">
    <!-- Info boxes -->

    <!-- /.col -->

    <!-- fix for small devices only -->

    <!-- /.row -->


    <!-- /.row -->

    <!-- Main row -->
    <div class="row">
      <div class="col-md-12 ">
        <!-- Horizontal Form -->
        <!-- /.box-header -->
        <!-- form start -->
        <form role="form">
          <div class="box-body">
            <div class="form-group">
              <table>
                <tr>
                  <td>
                    <label for="exampleInputEmail1 " class=" control-label col-md-1">Month</label>
                  </td>
                  <td>
                    <select class="form-control">
                      <option>Januari</option>
                      <option>Februari</option>
                      <option>Maret</option>
                      <option>April</option>
                    </select>
                  </td>
                  <td>
                    <label for="exampleInputEmail1 " class=" control-label col-md-1">Year</label>
                  </td>
                  <td>
                    <select class="form-control">
                      <option>2017</option>
                    </select>
                  </td>
                  <td>
                    <label for="exampleInputEmail1 " class=" control-label col-md-1">Logistic</label>
                  </td>
                  <td>
                    <select class="form-control">
                      <option>A Logistic</option>
                      <option>B Logistic</option>
                    </select>
                  </td>
                  <td>
                    &emsp;
                  </td>
                  <td>
                    <button type="submit" class="btn btn-info ">Search</button>
                  </td>
                  <td>
                    &emsp;
                  </td>
                  <td>
                    <button type="submit" class="btn btn-info">Upload</button>
                  </td>
                  <td>
                    <button class="button is-info"
                            onclick="document.getElementById('light2').style.display='block';document.getElementById('fade2').style.display='block'">
                      Upload
                    </button>
                    <div id="light2" class="white_content">
                      <p class="control has-addons has-addons-right">
                        <a
                          onclick="document.getElementById('light2').style.display='none';document.getElementById('fade2').style.display='none'">X &nbsp;</a>
                      </p>
                      <div class="tile is-parent">
                        <article class="tile is-child box ">

                          <h1 class="title">Upload Invoice</h1>

                          <div class="block ">
                            <table class="tablepopup" width="200px" margin="10px">
                              <tr>
                                <td>Month</td>
                                <td>
              <span class="select">
                <select>
                  <option>January</option>
                  <option>Februari</option>
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
                                <td>Logistic </td>
                                <td>
              <span class="select">
                <select>
                  <option>A Logistic</option>
				  <option>B Logistic</option>
				  <option>C Logistic</option>
                </select>
              </span>
                                </td>
                              </tr>
                              <tr>
                                <td>File</td>
                                <td>
                                  <input type="file" name="datafile" size="40">
                                </td>
                              </tr>
                              <tr>
                              </tr>
                              <tr>
                                <td>&nbsp;</td>
                              </tr>
                              <tr>
                                <td colspan="2">
                                  <button class="button is-info ">Submit Upload</button>
                                </td>
                              </tr>
                            </table>
                          </div>

                        </article>
                      </div>
                    </div>
                    <div id="fade2" class="black_overlay"></div>
                  </td>
                </tr>
              </table>

              <!--<label for="exampleInputEmail1 " class=" control-label col-md-1">Month : </label>-->
              <!--<span class="selectoption col-md-3">-->
                  <!--<select class="form-control controlleft">-->
                    <!--<option>Januari</option>-->
                    <!--<option>Februari</option>-->
                    <!--<option>Maret</option>-->
                    <!--<option>April</option>-->
                  <!--</select>-->
                <!--</span>-->
              <!--&emsp;-->
              <!--<span class="form-group">-->
                  <!--<label for="exampleInputEmail1 " class=" control-label col-md-1">Year : </label>-->
                  <!--<span class="selectoption col-md-3">-->
                  <!--<select class="form-control controlleft">-->
                    <!--<option>2016</option>-->
                    <!--<option>2017</option>-->
                  <!--</select>-->
                <!--</span>-->
              <!--</span>-->
              <!--&emsp;-->
              <!--<span class="form-group">-->
                  <!--<label for="exampleInputEmail1 " class=" control-label col-md-1">Logistic : </label>-->
                  <!--<span class="selectoption col-md-3">-->
                  <!--<select class="form-control controlleft">-->
                    <!--<option>A Logistic</option>-->
                    <!--<option>B Logistic</option>-->
                  <!--</select>-->
                <!--</span>-->
              <!--</span>-->
              <!--<button type="submit" class="btn btn-info btn-sm">Search</button>-->
              <!--<button type="submit" class="btn btn-info btn-sm">Upload</button>-->
            </div>


          </div>
          <!-- /.box-body -->
        </form>


        <div class="box box-info">
          <div class="box-header with-border">
            <h3 class="box-title">Summary - Invoice A Logistic / January / 2017</h3>
          </div>
          <!-- /.box-header -->
          <!-- form start -->
          <div class="box-body table-responsive ">

            <table class="table">
              <tr>
                <td><label for="inputEmail3">OK  : 298527 data</label></td>
                <td><label for="inputEmail3">Problem Exist   : 219 data</label></td>
                <td><label for="inputEmail3">Status  : Open</label></td>
                <td><label for="inputEmail3">Jumlah Tagihan   : Rp.xx.xxx.xxx</label></td>
              </tr>
            </table>
            <button type="submit" class="btn btn-info">View Data</button>
            <button type="submit" class="btn btn-info ">Submit</button>
            <button type="submit" class="btn btn-info pull-right">Approve</button>
          </div>
        </div>

        <div class="box">
          <div class="box-header">
            <h3 class="box-title">Upload History</h3>
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
                  <table aria-describedby="example1_info" role="grid" id="example1" class="table table-bordered table-striped dataTable">
                    <thead>
                    <tr role="row">
                      <th aria-label="Month: activate to sort column descending" aria-sort="ascending" style="width: 167px;" colspan="1" rowspan="1" aria-controls="example1" tabindex="0" class="sorting_asc">Month</th>
                      <th aria-label="Year: activate to sort column ascending" style="width: 207px;" colspan="1" rowspan="1" aria-controls="example1" tabindex="0" class="sorting">Year</th>
                      <th aria-label="OK: activate to sort column ascending" style="width: 182px;" colspan="1" rowspan="1" aria-controls="example1" tabindex="0" class="sorting">OK</th>
                      <th aria-label="Problem Exist: activate to sort column ascending" style="width: 142px;" colspan="1" rowspan="1" aria-controls="example1" tabindex="0" class="sorting">Problem Exist</th>
                      <th aria-label="Jumlah Tagihan: activate to sort column ascending" style="width: 101px;" colspan="1" rowspan="1" aria-controls="example1" tabindex="0" class="sorting">Jumlah Tagihan</th>
                      <th aria-label="Logistic: activate to sort column ascending" style="width: 182px;" colspan="1" rowspan="1" aria-controls="example1" tabindex="0" class="sorting">Logistic</th>
                      <th aria-label="Status: activate to sort column ascending" style="width: 182px;" colspan="1" rowspan="1" aria-controls="example1" tabindex="0" class="sorting">Status</th>
                      <th aria-label="Last Modified: activate to sort column ascending" style="width: 182px;" colspan="1" rowspan="1" aria-controls="example1" tabindex="0" class="sorting">Last Modified</th>
                    </tr>
                    </thead>
                    <tbody>
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

  export default {
    name: 'Tables',
    mounted () {
      this.$nextTick(() => {
        $('#example1').DataTable()
      })
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
    left: 30%;
    width: 25%;
    height: 60%;
    padding: 1px;
    border: 2px solid black;
    background-color: white;
    z-index: 1002;
    overflow: auto;
  }

  .black_overlay2 {
    display: none;
    position: fixed;
    top: -30%;
    left: 0%;
    width: 100%;
    height: 100%;
    z-index: 1001;
    -moz-opacity: 0.8;
    opacity: .80;
    filter: alpha(opacity=80);
  }

  .white_content2 {
    display: none;
    position: fixed;
    top: 10%;
    left: 25%;
    width: 50%;
    height: 80%;
    padding: 1px;
    border: 2px solid black;
    background-color: white;
    z-index: 1002;
    overflow: auto;
  }
  .one {
    margin-left: 5px;
  }
</style>
