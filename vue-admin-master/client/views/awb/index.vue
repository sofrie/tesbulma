<template>
  <div>
    <div class="tile is-parent">
      <div class="control is-horizontal">
        <form>
          <table>
            <tr>
              <td>
                <label>Month : </label>

                <span class="select">
                <select>
                  <option>Januari</option>
                  <option>Februari</option>
                </select>
              </span>
              </td>
              <td>

                <label>Logistic :</label>
                <span class="select">
          <select class="select">
            <option value="alogistic">A logistic</option>
            <option value="blogistic">B logistic</option>
            <option value="clogistic">C logistic</option>
            <option value="dlogistic">D logistic</option>
          </select>
          </span>

              </td>
              <td>

                <div class="control is-horizontal">
                  <label>AWB : </label>
                  &nbsp;
                  <div class="control is-grouped">
                    <p class="control is-expanded">
                      <input class="input" type="text" placeholder="AWB">
                    </p>
                  </div>
                </div>

              </td>
              &emsp;
              &emsp;
              <td>

                <div class="control is-horizontal">

                  <label>GDN  Ref # :</label>
                  &nbsp;
                  <div class="control is-grouped">
                    <p class="control is-expanded">
                      <input class="input" type="text" placeholder="Ref">
                    </p>
                  </div>
                </div>
              </td>

            </tr>
          </table>
        </form>
      </div>


    </div>

    <div class="tile is-parent">
      <div class="control is-horizontal">
        <table>
          <tr>
            <td>
              &emsp;
              <label>Year : </label>

              <span class="select">
                <select>
                  <option>2017</option>
                </select>
              </span>
            </td>
            <td>
              &nbsp;
              <label>Status :</label>
              <span class="select">
          <select class="select">
            <option value="alogistic">All</option>
            <option value="blogistic">OK</option>
            <option value="clogistic">Problem Exist</option>
          </select>
          </span>

            </td>
            <td>

              <div class="control is-horizontal">

                <label>Merchant Code : </label>
                &nbsp;
                <div class="control is-grouped">
                  <p class="control is-expanded">
                    <input class="input" type="text" placeholder="Code">
                  </p>
                </div>
              </div>

            </td>
            &emsp;
            &emsp;
            <td>
              <button class="button is-info pull-right">Submit</button>
            </td>
          </tr>
        </table>
      </div>
    </div>
    <div class="tile is-ancestor">
      <div class="tile is-parent">
        <article class="tile is-child box">
          <h4 class="title">AWB List</h4>
          <div class="table-responsive">
            <table class="table is-bordered is-striped is-narrow">
              <thead >
              <tr>
                <th>Month</th>
                <th>Year</th>
                <th>Logistic</th>
                <th>AWB</th>
                <th>Recon Status</th>
                <th>Merchant Code</th>
                <th>GDN Ref #</th>
              </tr>
              </thead>
              <tbody>

              <tr @click="openModalCard()">
                <td >
                  Januari
                </td>
                <td>
                  2017
                </td>
                <td >
                  A
                </td>
                <td >
                  AWB12345
                </td>
                <td>
                  OK
                </td>
                <td>
                  MERCH-CODE-0001
                </td>
                <td>
                  GDN-REF-ABC1
                </td>
              </tr>
              <tr >
                <td>
                  Januari
                </td>
                <td>
                  2017
                </td>
                <td>
                  A
                </td>
                <td>
                  AWB23456
                </td>
                <td>
                  Problem Exist
                </td>
                <td>
                  MERCH-CODE-0001
                </td>
                <td>
                  GDN-REF-ABC1
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
                  A
                </td>
                <td>
                  AWB34567
                </td>
                <td>
                  Problem Exist
                </td>
                <td>
                  MERCH-CODE-0001
                </td>
                <td>
                  GDN-REF-ABC1
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
                  A
                </td>
                <td>
                  AWB45678
                </td>
                <td>
                  OK
                </td>
                <td>
                  MERCH-CODE-0001
                </td>
                <td>
                  GDN-REF-ABC1
                </td>
              </tr>
              <tr >
                <td>
                  Januari
                </td>
                <td>
                  2017
                </td>
                <td>
                  A
                </td>
                <td>
                  AWB56789
                </td>
                <td>
                  Problem Exist
                </td>
                <td>
                  MERCH-CODE-0001
                </td>
                <td>
                  GDN-REF-ABC1
                </td>
              </tr>
              </tbody>
            </table>
            <div id="light2" class="white_content">
              <p class="control has-addons has-addons-right">
                <a
                  onclick="document.getElementById('light2').style.display='none';document.getElementById('fade2').style.display='none'">X &nbsp;</a>
              </p>
              <div class="tile is-parent">
                <article class="tile is-child ">
                  <h1 class="title">AWB13245 / GDN Ref-#1 (Problem Exist)</h1>
                  <div class="block ">
                    <table class="table" width="200px" margin="10px">
                      <tr>
                        <th>Reconciliation Data</th>
                        <th>Blibli Data</th>
                        <th>3PL Data</th>
                      </tr>
                      <tr>
                        <td>
                          <ul>
                            <li>
                              <label>Failure Reason :Data Mismatch</label>
                            </li>
                            <li>
                              <label>Merchant Code : MERCH-CODE-0001</label>
                            </li>
                            <li>
                              Merchant Name : Merchant 1
                            </li>
                            <li>
                              <label>Original Shipping Cost : Rp.xx.xxx.xxx</label>
                            </li>
                            <li>
                              <label>Adjusment Shipping Cost : Rp.xx.xxx.xxx</label>
                            </li>
                            <li>
                              <label>Notes : Setelah penyelidikan, ikut 3PL</label>
                            </li>
                          </ul>
                        </td>
                        <td>
                          <ul>
                            <li>
                              <label>Sender Name : Reza Lesmana</label>
                            </li>
                            <li>
                              <label>Sender Address : Jl.Jambu No.1</label>
                            </li>
                            <li>
                              <label>Origin Code : CGK001</label>
                            </li>
                            <li>
                              <label>Receiver Name : Sofriesilero Zumaytis</label>
                            </li>
                            <li>
                              <label>Receiver Address : Perum Kelapa</label>
                            </li>
                            <li>
                              <label>Destination Code : DPK001</label>
                            </li>
                          </ul>
                        </td>
                        <td>
                          <ul>
                            <li>
                              <label>Sender Name : Reza Lesmana</label>
                            </li>
                            <li>
                              <label>Sender Address : Jl.Jambu No.1</label>
                            </li>
                            <li>
                              <label>Origin Code : CGK001</label>
                            </li>
                            <li>
                              <label>Receiver Name : Sofriesilero Zumaytis</label>
                            </li>
                            <li>
                              <label>Receiver Address : Komplek Kelapa</label>
                            </li>
                            <li>
                              <label>Destination Code : DPK003</label>
                            </li>
                          </ul>
                        </td>
                      </tr>
                      <tr>
                        <!--<td colspan="2">-->
                        <!--<button class="button is-info ">Submit Upload</button>-->
                        <!--</td>-->
                      </tr>
                    </table>
                  </div>
                </article>
              </div>
              <div class="tile is-parent">
                <article class="tile is-child ">
                  <h1 class="title">Charge Summary</h1>
                  <div class="block ">
                    <table class="table" width="200px" margin="10px">
                      <tr>
                        <th></th>
                        <th>Weight</th>
                        <th>Price/Kg</th>
                        <th>Other Charge</th>
                        <th>Gift Wrap Charge</th>
                        <th>Insurance Charge</th>
                        <th>Total Charge</th>
                      </tr>
                      <tr>
                        <th>System</th>
                        <td>2</td>
                        <td>8700</td>
                        <td>0</td>
                        <td>0</td>
                        <td>125</td>
                        <td>17400</td>
                      </tr>
                      <tr>
                        <th>Logistic</th>
                        <td>3</td>
                        <td>9000</td>
                        <td>10000</td>
                        <td>0</td>
                        <td>150</td>
                        <td>37150</td>
                      </tr>
                      <tr>
                        <th>Applied</th>
                        <td>3</td>
                        <td>8700</td>
                        <td>10000</td>
                        <td>0</td>
                        <td>150</td>
                        <td>36250</td>
                      </tr>
                      <tr>
                        <th>Comment</th>
                        <td>Ikut 3PL</td>
                        <td>Ikut Blibli</td>
                        <td>Packing Kayu</td>
                        <td>-</td>
                        <td>-</td>
                        <td>-</td>
                      </tr>
                    </table>
                  </div>
                </article>
              </div>
            </div>

            <div id="fade2" class="black_overlay"></div>
          </div>
        </article>
      </div>

    </div>
  </div>
</template>

<script>
  import Vue from 'vue'
  import Modal from './modals/Modal'
  import AWBdetailModal from './modals/AWBdetailModal'

  const AWBdetailModalComponent = Vue.extend(AWBdetailModal)

  const openCardModal = (propsData = {
    visible: true
  }) => {
    return new AWBdetailModalComponent({
      el: document.createElement('div'),
      propsData
    })
  }

  export default {
    components: {
      Modal
    },

    data () {
      return {
        showModal: true,
        cardModal: null,
        imageModal: null
      }
    },

    methods: {
      openModalBasic () {
        this.showModal = true
      },

      closeModalBasic () {
        this.showModal = false
      },

      openModalCard () {
        const cardModal = this.AWBdetailModal || (this.AWBdetailModal = openCardModal({title: 'AWB13245 / GDN Ref-#1 (Problem Exist)', url: this.$store.state.pkg.homepage}))
        cardModal.$children[0].active()
      }
    }
  }
</script>

<style lang="scss">
  #vertical-2 thead, #vertical-2 tbody {
    display: inline-block;
  }

  td {
    width: 200px;
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
    left: 0%;
    top:20%;
    width: 100%;
    height: 120%;
    padding: 1px;
    border: 2px solid black;
    background-color: white;
    z-index: 1002;
    overflow: auto;
  }
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

</style>
