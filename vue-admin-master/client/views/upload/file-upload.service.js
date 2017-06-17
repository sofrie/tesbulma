/**
 * Created by sofrie.zumaytis on 6/14/2017.
 */
import axios from 'axios'

const BASE_URL = 'http://127.0.0.1:8080'

function upload (formData) {
  const url = `${BASE_URL}/api/upload`
  return axios.post(url, formData)
  axios.post(`http://127.0.0.1:8080/api/upload`, {
    uploadfile: formData
  })
}

export { upload }
