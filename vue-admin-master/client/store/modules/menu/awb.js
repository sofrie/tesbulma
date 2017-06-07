import lazyLoading from './lazyLoading'

export default {
  name: 'AWB',
  path: '/awb',
  meta: {
    icon: 'fa-file',
    expanded: false,
    link: 'awb/index.vue'
  },
  component: lazyLoading('awb', true)
}
