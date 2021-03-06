/**
 * Created by sofrie.zumaytis on 6/14/2017.
 */
import axios from 'axios'

const BASE_URL = 'http://127.0.0.1:8080'

function upload (formData) {
  //  const url = `${BASE_URL}/upload`
  const config = { headers: { 'Content-Type': 'multipart/form-data' } }
  axios.post(`http://127.0.0.1:8080/api/uploadHistory`, {
    month: this.selectedMonth,
    year: '2017',
    logistic: this.selectedLogistic
  })
  return axios.post(`http://127.0.0.1:8080/api/upload`, formData, config)
  // get data
    .then(x => x.data)
    // add url field
    .then(x => x.map(img => Object.assign({},
      img, { url: `${BASE_URL}/images/${img.id}` })))
}

export { upload }
