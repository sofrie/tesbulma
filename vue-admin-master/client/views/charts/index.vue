<template>
  <div>
  <div class="tile is-parent">
  <form>
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
	Status :  &nbsp
	<select>
	  <option value="open">Open</option>
	  <option value="submit">Submit</option>
	  <option value="approved">Approved</option>
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
	<button class="button is-info is-small">Submit</button>
	</form>
	</div>
	
    
	
      <div class="tile is-parent">
	  
        <article class="tile is-child box">
          <h4 class="title">AWB Table</h4>
          <div class="horizontal">
			<table id="vertical-2" class="table is-bordered is-striped is-narrow">
            <thead>
			<tr>
			<td > </td>
			<td >System</td>
			<td >Logistic</td>
			<td >Applied</td>
			<td >Comment</td>
			</tr>
			<tr>
			<th width="350px">AWB Number</th>
			
                    <td colspan="4" >data</td>
			</tr>
			<tr>
                  <th>Status</th>
				  <td>data</td>
                    <td colspan="4" >data</td>
				  </tr>
				  <tr>
                  <th>GDN Ref No</th>
				  <td colspan="4" >data</td>
				  </tr>
				  <tr>
                  <th>Insured Amount</th>
				  <td colspan="4" >data</td>
				  </tr>
				  <tr>
                  <th>Weight</th>
					<td>data</td>
                    <td>data</td>
                    <td>data</td>
					<td>data</td>
				  </tr>
				  
				  <tr>
				  <th>Price/Kg</th>
				  <td>data</td>
                    <td>data</td>
                    <td>data</td>
					<td>data</td>
				  </tr>
				  <tr>
				  <th>Other Charge</th>
				  <td>data</td>
                    <td>data</td>
                    <td>data</td>
					<td>data</td>
				  </tr>
				  <tr>
				  <th>Gift Wrap Charge</th>
				  <td>data</td>
                    <td>data</td>
                    <td>data</td>
					<td>data</td>
				  </tr>
				  <tr>
				  <th>Insurance Charge</th>
				  <td>data</td>
                    <td>data</td>
                    <td>data</td>
					<td>data</td>
				  </tr>
				  <tr>
				  <th>Total Charge</th>
				  <td>data</td>
                    <td>data</td>
                    <td>data</td>
					<td>data</td>
				  </tr>
				  <tr>
				  <th>Failure</th>
					<td colspan="4" >data</td>
				  </tr>
				  <tr>
				  <th>Notes</th>
					<td colspan="4" >data</td>
				  </tr>
				  <tr>
				  <th>Nama Pengirim</th>
					<td colspan="4" >data</td>
				  </tr>
				  <tr>
				  <th>Merchant Code</th>
					<td colspan="4" >data</td>
				  </tr>
				  <tr>
				  <th>Merchant Name</th>
				  <td colspan="4" >data</td>
				  </tr>
				  <tr>
				  <th>Nama Pengirim Sistem</th>
				  <td colspan="4" >data</td>
				  </tr>
				  <tr>
				  <th>API Alamat Pengirim</th>
				  <td colspan="4" >data</td>
				  </tr>
				  <tr>
				  <th>Sistem Alamat Pengirim</th>
				 <td colspan="4" >data</td>
				  </tr>
				  <tr>
				  <th>API Kode Origin</th>
				  <td colspan="4" >data</td>
				  </tr>
				  <tr>
				  <th>Sistem Kode Origin</th>
				  <td colspan="4" >data</td>
				  </tr>
				  <tr>
				  <th>API Nama Penerima</th>
				  <td colspan="4" >data</td>
				  </tr>
				  <tr>
				  <th>Sistem Nama Penerima</th>
				 <td colspan="4" >data</td>
				  </tr>
				  <tr>
				  <th>API Alamat Penerima</th>
				  <td colspan="4" >data</td>
				  </tr>
				  <tr>
				  <th>Sistem Alamat Penerima</th>
				  <td colspan="4" >data</td>
				  </tr>
				  <tr>
				  <th>API Kode Destinasi</th>
				  <td colspan="4" >data</td>
				  </tr>
				  <tr>
				  <th>Sistem Kode Destinasi</th>
				  <td colspan="4" >data</td>
				  </tr>
				  <tr>
				  <th>Finance Original Ship Cost</th>
				  <td colspan="4" >data</td>
				  </tr>
				  <tr>
				  <th>Finance Original Ship Cost Adjustment</th>  
				  <td colspan="4" >data</td>
</tr>				  
            </thead>

        </table>
</div>
        </article>
      </div>
  </div>
</template>

<style lang="scss">
#vertical-2 thead,#vertical-2 tbody{
                display:inline-block;
            }
td
{
	width:200px;
}
</style>
