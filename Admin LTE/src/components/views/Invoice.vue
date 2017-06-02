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
              <label for="exampleInputEmail1 " class=" control-label">Month : </label>
              <span class="selectoption">
                  <select>
                    <option>Januari</option>
                    <option>Februari</option>
                    <option>Maret</option>
                    <option>April</option>
                  </select>
                </span>
              &emsp;
              <span class="form-group">
                  <label for="exampleInputEmail1 " class=" control-label">Year : </label>
                  <span class="selectoption">
                  <select>
                    <option>2016</option>
                    <option>2017</option>
                  </select>
                </span>
              </span>
              &emsp;
              <span class="form-group">
                  <label for="exampleInputEmail1 " class=" control-label">Logistic : </label>
                  <span class="selectoption">
                  <select>
                    <option>A Logistic</option>
                    <option>B Logistic</option>
                  </select>
                </span>
              </span>
              <button type="submit" class="btn btn-info btn-sm">Search</button>
              <button type="submit" class="btn btn-info btn-sm">Upload</button>
            </div>


          </div>
          <!-- /.box-body -->
        </form>

        <div class="box box-info">
          <div class="box-header with-border">
            <h3 class="box-title">Summary</h3>
          </div>
          <!-- /.box-header -->
          <!-- form start -->
          <div class="box-body">

            <table>
              <tr>
                <td><label for="inputEmail3">Month </label></td>
                <td><label for="inputEmail3"> : </label></td>
                <td><label for="inputEmail3">Januari</label></td>
              </tr>
              <tr>
                <td><label for="inputEmail3">Year </label></td>
                <td><label for="inputEmail3"> : </label></td>
                <td><label for="inputEmail3">2017</label></td>
              </tr>
              <tr>
                <td><label for="inputEmail3">Logistic </label></td>
                <td><label for="inputEmail3">:</label></td>
                <td><label for="inputEmail3">A Logistic</label></td>
              </tr>
              <tr>
                <td><label for="inputEmail3">Status </label></td>
                <td><label for="inputEmail3"> : </label></td>
                <td><label for="inputEmail3">Open</label></td>
              </tr>
              <tr>
                <td><label for="inputEmail3">OK  </label></td>
                <td><label for="inputEmail3"> : </label></td>
                <td><label for="inputEmail3">298527 data</label></td>
              </tr>
              <tr>
                <td><label for="inputEmail3">Problem Exist  </label></td>
                <td><label for="inputEmail3"> : </label></td>
                <td><label for="inputEmail3">219 data</label></td>
              </tr>
              <tr>
                <td><label for="inputEmail3">Jumlah Tagihan  </label></td>
                <td><label for="inputEmail3"> : </label></td>
                <td><label for="inputEmail3">Rp.xx.xxx.xxx</label></td>
              </tr>
            </table>
            <button type="submit" class="btn btn-info btn-sm">View Data</button>
            <button type="submit" class="btn btn-info btn-sm">Submit</button>
            <button type="submit" class="btn btn-info btn-sm pull-right">Approve</button>
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
                      <th aria-label="Browser: activate to sort column ascending" style="width: 207px;" colspan="1" rowspan="1" aria-controls="example1" tabindex="0" class="sorting">Year</th>
                      <th aria-label="Platform(s): activate to sort column ascending" style="width: 182px;" colspan="1" rowspan="1" aria-controls="example1" tabindex="0" class="sorting">OK</th>
                      <th aria-label="Problem Exist: activate to sort column ascending" style="width: 142px;" colspan="1" rowspan="1" aria-controls="example1" tabindex="0" class="sorting">Problem Exist/th>
                      <th aria-label="Jumlah Tagihan: activate to sort column ascending" style="width: 101px;" colspan="1" rowspan="1" aria-controls="example1" tabindex="0" class="sorting">Jumlah Tagihan</th>
                      <th aria-label="Logistice: activate to sort column ascending" style="width: 101px;" colspan="1" rowspan="1" aria-controls="example1" tabindex="0" class="sorting">Logistic</th>
                      <th aria-label="Status: activate to sort column ascending" style="width: 101px;" colspan="1" rowspan="1" aria-controls="example1" tabindex="0" class="sorting">Status</th>
                      <th aria-label="Last Modified: activate to sort column ascending" style="width: 101px;" colspan="1" rowspan="1" aria-controls="example1" tabindex="0" class="sorting">Last Modified</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr class="even" role="row">
                      <td class="sorting_1">Blink</td>
                      <td>Iridium  54.0</td>
                      <td>GNU/Linux</td>
                      <td>54</td>
                      <td>A</td>
                    </tr>
                    <tr class="odd" role="row">
                      <td class="sorting_1">Gecko</td>
                      <td>Firefox 1.0</td>
                      <td>Win 98+ / OSX.2+</td>
                      <td>1.7</td>
                      <td>A</td>
                    </tr>
                    <tr class="even" role="row">
                      <td class="sorting_1">Gecko</td>
                      <td>Firefox 1.5</td>
                      <td>Win 98+ / OSX.2+</td>
                      <td>1.8</td>
                      <td>A</td>
                    </tr>
                    <tr class="odd" role="row">
                      <td class="sorting_1">Gecko</td>
                      <td>Firefox 2.0</td>
                      <td>Win 98+ / OSX.2+</td>
                      <td>1.8</td>
                      <td>A</td>
                    </tr>
                    <tr class="even" role="row">
                      <td class="sorting_1">Gecko</td>
                      <td>Firefox 3.0</td>
                      <td>Win 2k+ / OSX.3+</td>
                      <td>1.9</td>
                      <td>A</td>
                    </tr>
                    <tr class="odd" role="row">
                      <td class="sorting_1">Gecko</td>
                      <td>Camino 1.0</td>
                      <td>OSX.2+</td>
                      <td>1.8</td>
                      <td>A</td>
                    </tr>
                    <tr class="even" role="row">
                      <td class="sorting_1">Gecko</td>
                      <td>Camino 1.5</td>
                      <td>OSX.3+</td>
                      <td>1.8</td>
                      <td>A</td>
                    </tr>
                    <tr class="odd" role="row">
                      <td class="sorting_1">Gecko</td>
                      <td>Netscape 7.2</td>
                      <td>Win 95+ / Mac OS 8.6-9.2</td>
                      <td>1.7</td>
                      <td>A</td>
                    </tr>
                    <tr class="even" role="row">
                      <td class="sorting_1">Gecko</td>
                      <td>Netscape Browser 8</td>
                      <td>Win 98SE+</td>
                      <td>1.7</td>
                      <td>A</td>
                    </tr>
                    <tr class="odd" role="row">
                      <td class="sorting_1">Gecko</td>
                      <td>Netscape Navigator 9</td>
                      <td>Win 98+ / OSX.2+</td>
                      <td>1.8</td>
                      <td>A</td>
                    </tr>
                    <tr class="even" role="row">
                      <td class="sorting_1">Gecko</td>
                      <td>Mozilla 1.0</td>
                      <td>Win 95+ / OSX.1+</td>
                      <td>1</td>
                      <td>A</td>
                    </tr>
                    </tbody>
                    <tfoot>
                    <tr>
                      <th colspan="1" rowspan="1">Rendering engine</th>
                      <th colspan="1" rowspan="1">Browser</th>
                      <th colspan="1" rowspan="1">Platform(s)</th>
                      <th colspan="1" rowspan="1">Engine version</th>
                      <th colspan="1" rowspan="1">CSS grade</th>
                    </tr>
                    </tfoot>
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
</style>
