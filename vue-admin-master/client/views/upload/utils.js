/**
 * Created by sofrie.zumaytis on 6/14/2017.
 */
function wait (ms) {
  return (x) => {
    return new Promise(resolve => setTimeout(() => resolve(x), ms))
  }
}

export { wait }
