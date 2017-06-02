<template>
  <div>
    <div class="tile is-parent">
      <div class="control is-horizontal">
<table >
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

        &emsp;
        &emsp;
        &emsp;
        &emsp;

          <label >AWB : </label>
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
      </div>


    </div>

    <div class="tile is-parent">
      <div class="control is-horizontal">
        <table >
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

                <label >Merchant Code : </label>
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
              <thead>
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
          </div>
        </article>
      </div>
    </div>
  </div>
</template>

<style lang="scss">
  #vertical-2 thead, #vertical-2 tbody {
    display: inline-block;
  }

  td {
    width: 200px;
  }
</style>
