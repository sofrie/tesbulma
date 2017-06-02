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
    </span> &emsp;
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
        Status :  &nbsp
        <span class="select">
	<select>
	  <option value="open">Open</option>
	  <option value="submit">Submit</option>
	  <option value="approved">Approved</option>
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
        &emsp;
        <button class="button is-info ">Search</button>
      </form>
    </div>


    <div class="tile is-ancestor">
      <div class="tile is-parent">
        <article class="tile is-child box">
          <h4 class="title">Summary</h4>
          <div class="table-responsive">
            <table class="table is-bordered is-striped is-narrow">
              <thead>
              <tr>
                <th>Month</th>
                <th>Year</th>
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
                  Rp. x.xxx.xxx
                </td>
                <td>
                  A Logistic
                </td>
                <td>
                  Open
                </td>
                <td>
                  3 Februari 2017
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
                  Rp. x.xxx.xxx
                </td>
                <td>
                  B Logistic
                </td>
                <td>
                  Submit
                </td>
                <td>
                  9 Mei 2017
                </td>
              </tr>
              <tr>
                <td>
                  Febuari
                </td>
                <td>
                  2017
                </td>
                <td>
                  Rp. x.xxx.xxx
                </td>
                <td>
                  C Logistic
                </td>
                <td>
                  Approved
                </td>
                <td>
                  27 Mei 2017
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
