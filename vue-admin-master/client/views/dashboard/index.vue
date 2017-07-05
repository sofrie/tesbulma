<template>
  <div>
    <div class="is-parent">

<div class="block">
	<div class="control is-horizontal">
		<div class="control-label">
			<label class="label">Month : </label>
		</div>
		<div class="control">
			<div class="select is-fullwidth">
				<select v-on:change="changeMonth()" v-model="selectedMonth">
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
		<div class="control-label">
			<label class="label">Year : </label>
		</div>
		<div class="control">
			<div class="select is-fullwidth">
				<select v-on:change="changeYear()" v-model="selectedYear">
					<option>2017</option>
					<option>2018</option>
				</select>
			</div>
		</div>
		<div class="control-label">
			<label class="label">Status : </label>
		</div>
		<div class="control">
			<div class="select is-fullwidth">
				<select class="select" v-model="statusawb" v-on:change="changeStatus()">
					<option value="OK">OK</option>
					<option value="Problem Exist">Problem Exist</option>
				</select>
			</div>
		</div>
		<div class="control-label">
			<label class="label">Logistic : </label>
		</div>
		<div class="control">
			<div class="select is-fullwidth">
				<select v-on:change="changeLogistic()" v-model="selectedLogistic">
					<option value="A Logistic">A Logistic</option>
					<option value="B Logistic">B Logistic</option>
					<option value="C Logistic">C Logistic</option>
					<option value="D Logistic">D Logistic</option>
				</select>
			</div>
		</div>
		<div class="control-label">
		</div>
		<div class="control">
			<button class="button btn-search is-info ">Search</button>
		</div>
	</div>
	</div>
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
  import axios from 'axios'

  export default {
    data: () => ({
      posts: [],
      errors: []
    }),

    // Fetches posts when the component is created.
    created () {
      axios.get(`http://demo4092590.mockable.io/tesapi`)
        .then(response => {
          // JSON responses are automatically parsed.
          this.posts = response.data
        })
        .catch(e => {
          this.errors.push(e)
        })

      // async / await version (created() becomes async created())
      //
      // try {
      //   const response = await axios.get(`http://jsonplaceholder.typicode.com/posts`)
      //   this.posts = response.data
      // } catch (e) {
      //   this.errors.push(e)
      // }
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
  .control-label{
	flex-basis:100px;
	margin-right:10px
  }
  .btn-search{
	padding-top:0px;
	text-align:left;
  }
</style>
