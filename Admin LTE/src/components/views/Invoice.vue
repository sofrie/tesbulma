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
                  <label for="exampleInputEmail1 " class="col-sm-1">Month : </label>
                  <div class="col-sm-1">
                  <select class="form-control">
                    <option>option 1</option>
                    <option>option 2</option>
                    <option>option 3</option>
                    <option>option 4</option>
                    <option>option 5</option>
                  </select>
                </div>
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Password</label>
                  <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                </div>
                <div class="form-group">
                  <label for="exampleInputFile">File input</label>
                  <input type="file" id="exampleInputFile">

                  <p class="help-block">Example block-level help text here.</p>
                </div>
                <div class="checkbox">
                  <label>
                    <input type="checkbox"> Check me out
                  </label>
                </div>
              </div>
              <!-- /.box-body -->

              <div class="box-footer">
                <button type="submit" class="btn btn-primary">Submit</button>
              </div>
            </form>

          <form class="form">
            <div class="box-body">
              <div class="form-group">
                <label for="inputEmail3" class="col-xs-1" >Email</label>
                <div class="col-sm-2">
                  <select class="form-control">
                    <option>option 1</option>
                    <option>option 2</option>
                    <option>option 3</option>
                    <option>option 4</option>
                    <option>option 5</option>
                  </select>
                </div>

                <label for="inputEmail3" class="col-sm-1 control-label">Email</label>
                <div class="col-sm-2">
                  <select class="form-control">
                    <option>option 1</option>
                    <option>option 2</option>
                    <option>option 3</option>
                    <option>option 4</option>
                    <option>option 5</option>
                  </select>
                </div>

                <label for="inputEmail3" class="col-sm-1 control-label">Email</label>
                <div class="col-sm-2">
                  <select class="form-control">
                    <option>option 1</option>
                    <option>option 2</option>
                    <option>option 3</option>
                    <option>option 4</option>
                    <option>option 5</option>
                  </select>
                </div>
                <div class="col-sm-2">
                  <button type="submit" class="btn btn-info">Search</button>
                  &nbsp;
                  <button type="submit" class="btn btn-info">Upload</button>
                </div>
              </div>

            </div>              
          </form>

        <div class="box box-info">
            <div class="box-header with-border">
              <h3 class="box-title">Summary</h3>
            </div>
            <!-- /.box-header -->
            <!-- form start -->
            <div class="box-body">

            <table>
            <tr >
              <td><label for="inputEmail3" >Month </label></td>
              <td><label for="inputEmail3"  > : </label></td>
              <td><label for="inputEmail3"  >Januari</label></td>
            </tr>
            <tr >
              <td><label for="inputEmail3"  >Year </label></td>
              <td><label for="inputEmail3"  > : </label></td>
              <td> <label for="inputEmail3"  >2017</label> </td>
            </tr>
            <tr >
              <td><label for="inputEmail3"  >Logistic </label></td>
              <td><label for="inputEmail3"  >:</label>                  </td>
              <td><label for="inputEmail3"  >A Logistic</label>                  </td>
            </tr>
            <tr >
              <td><label for="inputEmail3"  >Status </label></td>
              <td><label for="inputEmail3"  > : </label></td>
              <td><label for="inputEmail3"  >Open</label>                  </td>
            </tr>
            <tr>
              <td><label for="inputEmail3"  >OK  </label> </td>
              <td><label for="inputEmail3"  > : </label></td>
              <td><label for="inputEmail3"  >298527 data</label> </td>
            </tr>
             <tr>
              <td><label for="inputEmail3" >Problem Exist  </label> </td>
             <td><label for="inputEmail3"  > : </label></td>
              <td><label for="inputEmail3"  >219 data</label>  </td>
            </tr>
             <tr>
              <td><label for="inputEmail3"  >Jumlah Tagihan  </label> </td>
              <td><label for="inputEmail3"  > : </label></td>
              <td><label for="inputEmail3"  >Rp.xx.xxx.xxx</label>        </td>
            </tr>
            </table>
            </div>
            
          </div>

      </div>
    </div>
    <!-- /.row -->
  </section>
  <!-- /.content -->
</template>

<script>
  import Chart from 'chart.js'

  export default {
    data () {
      return {
        generateRandomNumbers (numbers, max, min) {
          var a = []
          for (var i = 0; i < numbers; i++) {
            a.push(Math.floor(Math.random() * (max - min + 1)) + max)
          }
          return a
        }
      }
    },
    computed: {
      coPilotNumbers () {
        return this.generateRandomNumbers(12, 1000000, 10000)
      },
      personalNumbers () {
        return this.generateRandomNumbers(12, 1000000, 10000)
      },
      isMobile () {
        return (window.innerWidth <= 800 && window.innerHeight <= 600)
      }
    },
    mounted () {
      this.$nextTick(() => {
        var ctx = document.getElementById('trafficBar').getContext('2d')
        var config = {
          type: 'line',
          data: {
            labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
            datasets: [{
              label: 'CoPilot',
              fill: false,
              borderColor: '#284184',
              pointBackgroundColor: '#284184',
              backgroundColor: 'rgba(0, 0, 0, 0)',
              data: this.coPilotNumbers
            }, {
              label: 'Personal Site',
              borderColor: '#4BC0C0',
              pointBackgroundColor: '#4BC0C0',
              backgroundColor: 'rgba(0, 0, 0, 0)',
              data: this.personalNumbers
            }]
          },
          options: {
            responsive: true,
            maintainAspectRatio: !this.isMobile,
            legend: {
              position: 'bottom',
              display: true
            },
            tooltips: {
              mode: 'label',
              xPadding: 10,
              yPadding: 10,
              bodySpacing: 10
            }
          }
        }

        new Chart(ctx, config) // eslint-disable-line no-new

        var pieChartCanvas = document.getElementById('languagePie').getContext('2d')
        var pieConfig = {
          type: 'pie',
          data: {
            labels: ['HTML', 'JavaScript', 'CSS'],
            datasets: [{
              data: [56.6, 37.7, 4.1],
              backgroundColor: ['#00a65a', '#f39c12', '#00c0ef'],
              hoverBackgroundColor: ['#00a65a', '#f39c12', '#00c0ef']
            }]
          },
          options: {
            responsive: true,
            maintainAspectRatio: !this.isMobile,
            legend: {
              position: 'bottom',
              display: true
            }
          }
        }

        new Chart(pieChartCanvas, pieConfig) // eslint-disable-line no-new
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
</style>
