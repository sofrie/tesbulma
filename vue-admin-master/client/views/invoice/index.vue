<template>
  <div>
    <div class="tile is-parent">
      <form>
      Month :  &nbsp
        <span class="select">
      <select>
        <option value="januari">Januari</option>
        <option value="februari">Februari</option>
        <option value="maret">Maret</option>
        <option value="april">April</option>
      </select>
        </span>      &emsp;
      &emsp;
      Year :  &nbsp
        <span class="select">
      <select>
        <option value="2016">2016</option>
        <option value="2017">2017</option>
      </select>
        </span>
      &emsp;
      &emsp;
      Logistic :  &nbsp
        <span class="select">
      <select>
        <option value="alogistic">A logistic</option>
        <option value="blogistic">B logistic</option>
        <option value="clogistic">C logistic</option>
        <option value="dlogistic">D logistic</option>
      </select>
        </span>
      &emsp;
      &emsp;<button class="button is-info"> Search</button>
      &emsp;
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
      </form>
    </div>
    <div class="block">
      <article class="tile is-child box">
        <h1 class="title">Summary</h1>

        <p class="control">
          Month : January
        </p>
        <p class="control">
          Year 2017
        <p class="control">
          Logistic : A logistic
        <p class="control">
          Status : Open
        </p>
        <p class="control">
          OK : 29527 data
        </p>
        <p class="control">
          Problem Exists : 219 data
        </p>
        <p class="control">
          Jumlah Tagihan : Rp.xx.xxx.xxx
        </p>

        <button class="button is-info">View Data</button>
        <button class="button is-info">Download</button>
        <button class="button is-info pull-right one">Approve</button>
        <button class="button is-info pull-right">Submit</button>
        <!--<button class="button is-info" onclick="document.getElementById('light').style.display='block';document.getElementById('fade').style.display='block'">	-->
        <!--View Data-->
        <!--</button>-->
        <!--<div id="light" class="white_content2">-->
        <!--<p class="control has-addons has-addons-right">-->
        <!--<a onclick="document.getElementById('light').style.display='none';document.getElementById('fade').style.display='none'">X &nbsp;</a>-->
        <!--</p>-->
        <!--<div class="tile is-parent">-->
        <!--<article class="tile is-child box " >-->

        <!--<div class="block ">-->
        <!--<h4 class="title">Data History</h4>-->
        <!--<div class="table-responsive">-->
        <!--<table class="table is-bordered is-striped is-narrow">-->
        <!--<thead>-->
        <!--<tr>-->
        <!--<th>Month</th>-->
        <!--<th>Year</th>-->
        <!--<th>OK</th>-->
        <!--<th>Problem Exists</th>-->
        <!--<th>Jumlah Tagihan</th>-->
        <!--<th>Logistic</th>-->
        <!--<th>Status</th>-->
        <!--<th>Last Modified</th>-->
        <!--</tr>-->
        <!--</thead>-->
        <!--<tbody>-->
        <!--<tr>-->
        <!--<td>-->
        <!--Januari-->
        <!--</td>-->
        <!--<td>-->
        <!--2017-->
        <!--</td>-->
        <!--<td>-->
        <!--297227-->
        <!--</td>-->
        <!--<td >-->
        <!--30000-->
        <!--</td>-->
        <!--<td >-->
        <!--Rp. x.xxx.xxx-->
        <!--</td>-->
        <!--<td >-->
        <!--A-->
        <!--</td>-->
        <!--<td >-->
        <!--Done-->
        <!--</td>-->
        <!--<td >-->
        <!--3 Februari 2017 09:05:10-->
        <!--</td>-->
        <!--</tr>-->
        <!--<tr>-->
        <!--<td>-->
        <!--Januari-->
        <!--</td>-->
        <!--<td>-->
        <!--2017-->
        <!--</td>-->
        <!--<td>-->
        <!--300-->
        <!--</td>-->
        <!--<td >-->
        <!--10-->
        <!--</td>-->
        <!--<td >-->
        <!--Rp. x.xxx.xxx-->
        <!--</td>-->
        <!--<td >-->
        <!--A-->
        <!--</td>-->
        <!--<td >-->
        <!--Done-->
        <!--</td>-->
        <!--<td >-->
        <!--9 Februari 2017 11:05:10-->
        <!--</td>-->
        <!--</tr>-->
        <!--<tr>-->
        <!--<td>-->
        <!--Januari-->
        <!--</td>-->
        <!--<td>-->
        <!--2017-->
        <!--</td>-->
        <!--<td>-->
        <!--1000-->
        <!--</td>-->
        <!--<td >-->
        <!--141-->
        <!--</td>-->
        <!--<td >-->
        <!--Rp. x.xxx.xxx-->
        <!--</td>-->
        <!--<td >-->
        <!--A-->
        <!--</td>-->
        <!--<td >-->
        <!--Done-->
        <!--</td>-->
        <!--<td >-->
        <!--27 Februari 2017 10:05:10-->
        <!--</td>-->
        <!--</tr>-->
        <!--<tr>-->
        <!--<td>-->
        <!--Januari-->
        <!--</td>-->
        <!--<td>-->
        <!--2017-->
        <!--</td>-->
        <!--<td>-->
        <!--0-->
        <!--</td>-->
        <!--<td >-->
        <!--0-->
        <!--</td>-->
        <!--<td >-->
        <!--Rp. x.xxx.xxx-->
        <!--</td>-->
        <!--<td >-->
        <!--A-->
        <!--</td>-->
        <!--<td >-->
        <!--Done-->
        <!--</td>-->
        <!--<td >-->
        <!--28 Februari 2017 15:05:10-->
        <!--</td>-->
        <!--</tr>-->
        <!--<tr>-->
        <!--<td>-->
        <!--Januari-->
        <!--</td>-->
        <!--<td>-->
        <!--2017-->
        <!--</td>-->
        <!--<td>-->
        <!--0-->
        <!--</td>-->
        <!--<td >-->
        <!--0-->
        <!--</td>-->
        <!--<td >-->
        <!--Rp. x.xxx.xxx-->
        <!--</td>-->
        <!--<td >-->
        <!--A-->
        <!--</td>-->
        <!--<td >-->
        <!--Done-->
        <!--</td>-->
        <!--<td >-->
        <!--3 Februari 2017 15:05:10-->
        <!--</td>-->
        <!--</tr>-->
        <!--<tr>-->
        <!--<td colspan="3">-->
        <!--111111-->
        <!--</td>-->
        <!--<td >-->
        <!--4000-->
        <!--</td>-->
        <!--<td colspan="4">-->
        <!--Rp. x.xxx.xxx-->
        <!--</td>-->
        <!--</tr>-->
        <!--</tbody>-->
        <!--</table>-->
        <!--</div>-->
        <!--</div>-->

        <!--</article>-->
        <!--</div>-->
        <!--<div id="fade" class="black_overlay2"></div>-->


        <!--</div>-->
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
              <tr>
                <td>
                  Januari
                </td>
                <td>
                  2017
                </td>
                <td>
                  297227
                </td>
                <td>
                  30000
                </td>
                <td>
                  Rp. x.xxx.xxx
                </td>
                <td>
                  A
                </td>
                <td>
                  Done
                </td>
                <td>
                  3 Februari 2017 09:05:10
                </td>
              </tr>
              <tr>
                <td>
                  Januari
                </td>
                <td>
                  2017
                </td>
                <td>
                  300
                </td>
                <td>
                  10
                </td>
                <td>
                  Rp. x.xxx.xxx
                </td>
                <td>
                  A
                </td>
                <td>
                  Done
                </td>
                <td>
                  9 Februari 2017 11:05:10
                </td>
              </tr>
              <tr>
                <td>
                  Januari
                </td>
                <td>
                  2017
                </td>
                <td>
                  1000
                </td>
                <td>
                  141
                </td>
                <td>
                  Rp. x.xxx.xxx
                </td>
                <td>
                  A
                </td>
                <td>
                  Done
                </td>
                <td>
                  27 Februari 2017 10:05:10
                </td>
              </tr>
              <tr>
                <td>
                  Januari
                </td>
                <td>
                  2017
                </td>
                <td>
                  0
                </td>
                <td>
                  0
                </td>
                <td>
                  Rp. x.xxx.xxx
                </td>
                <td>
                  A
                </td>
                <td>
                  On Process
                </td>
                <td>
                  28 Februari 2017 15:05:10
                </td>
              </tr>
              <tr>
                <td>
                  Januari
                </td>
                <td>
                  2017
                </td>
                <td>
                  0
                </td>
                <td>
                  0
                </td>
                <td>
                  Rp. x.xxx.xxx
                </td>
                <td>
                  A
                </td>
                <td>
                  Uploaded
                </td>
                <td>
                  3 Februari 2017 15:05:10
                </td>
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

  export default {
    components: {
      Collapse,
      CollapseItem
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
