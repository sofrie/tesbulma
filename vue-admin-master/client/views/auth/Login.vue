<template>
  <div>
  <div class="tile is-parent">
	Month :  &nbsp
	<select>
	  <option value="januari">Januari</option>
	  <option value="februari">Februari</option>
	  <option value="maret">Maret</option>
	  <option value="april">April</option>
	</select>
	&emsp;
	&emsp;
	Year :  &nbsp
	<select>
	  <option value="2016">2016</option>
	  <option value="2017">2017</option>
	</select>
	&emsp;
	&emsp;
	Logistic :  &nbsp
	<select>
	  <option value="alogistic">A logistic</option>
	  <option value="blogistic">B logistic</option>
	  <option value="clogistic">C logistic</option>
	  <option value="dlogistic">D logistic</option>
	</select>	
	&emsp;
	&emsp;
	<button class="button is-info">Search</button>
	&emsp;
	&emsp;
	<button class="button is-info">
	
		  <a href="javascript:void(0)" onclick="document.getElementById('light').style.display='block';document.getElementById('fade').style.display='block'">Upload</a>
  </button>
  <div id="light" class="white_content">
  <p class="control has-addons has-addons-right">
  <a href="javascript:void(0)" onclick="document.getElementById('light').style.display='none';document.getElementById('fade').style.display='none'">X &nbsp;</a>
  </p>
	<div class="tile is-parent">
        <article class="tile is-child box " >
	
          <h1 class="title">Upload Invoice</h1>
          <div class="block ">
            <p class="control has-addons has-addons-centered">
			Month : &nbsp;
              <span class="select">
                <select>
                  <option>January</option>
                  <option>Februari</option>
                </select>
              </span>
            </p>
            <p class="control has-addons has-addons-centered">
			Year : &nbsp;
              <span class="select">
                <select>
                  <option>2017</option>
                </select>
              </span>
            </p>
			<p class="control has-addons has-addons-centered">
			Logistic : &nbsp;
              <span class="select">
                <select>
                  <option>A Logistic</option>
				  <option>B Logistic</option>
				  <option>C Logistic</option>
                </select>
              </span>
            </p>
			<p class="control has-addons has-addons-right">
			File : &nbsp;
              <input type="file" name="datafile" size="40">
            </p>
			
            <p class="control has-addons has-addons-centered">
              <button class="button is-info">Submit Upload</button>
            </p>
          </div>
		  
        </article>
      </div>
	</div>
  <div id="fade" class="black_overlay"></div>
	
	</div>
	<div class="block">
        <article class="tile is-child box">
          <h1 class="title">Summary</h1>
         
		  <p class="control">
            Month : January &emsp; Year 2017 &emsp; Logistic : A logistic &emsp; Status : Open
			</p>
			<p class="control">
			OK : 29527 data &emsp; Problem Exists : 219 data &emsp;&emsp;&emsp; Jumlah Tagihan : Rp.xx.xxx.xxx
			</p>
			
             
            <p class="control">
				<button class="button is-info">View Data</button>              	
				<button class="button is-info">Submit</button>
				<button class="button is-info">Approve</button>
				
            </p>
         
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
                  <td >
                    30000
                  </td>
                  <td >
                    Rp. x.xxx.xxx
                  </td>
                  <td >
                    A
                  </td>
				  <td >
                    Done
                  </td>
				  <td >
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
                  <td >
                    10
                  </td>
                  <td >
                    Rp. x.xxx.xxx
                  </td>
                  <td >
                    A
                  </td>
				  <td >
                    Done
                  </td>
				  <td >
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
                  <td >
                    141
                  </td>
                  <td >
                    Rp. x.xxx.xxx
                  </td>
                  <td >
                    A
                  </td>
				  <td >
                    Done
                  </td>
				  <td >
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
                  <td >
                    0
                  </td>
                  <td >
                    Rp. x.xxx.xxx
                  </td>
                  <td >
                    A
                  </td>
				  <td >
                    On Process
                  </td>
				  <td >
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
                  <td >
                    0
                  </td>
                  <td >
                    Rp. x.xxx.xxx
                  </td>
                  <td >
                    A
                  </td>
				  <td >
                    Uploaded
                  </td>
				  <td >
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
import { Collapse, Item as CollapseItem } from 'vue-bulma-collapse'

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
  overflow-x: auto;
}
.black_overlay {
  display: none;
  position: absolute;
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
  position: absolute;
  left: 25%;
  width: 25%;
  height: 80%;
  padding: 1px;
  border: 2px solid black;
  background-color: white;
  z-index: 1002;
  overflow: auto;
}
</style>
