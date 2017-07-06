<template>
  <div>
  <div class="tile is-parent">
	<div class="login-form">
	<div class="block">
		<div class="is-parent">
			<article class="tile login-box is-child box">
				<h1 class="title"><a href="/"><img class="login-logo" src="data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiIHN0YW5kYWxvbmU9Im5vIj8+DQo8c3ZnIHdpZHRoPSIyMDBweCIgaGVpZ2h0PSIyMDBweCIgdmlld0JveD0iMCAwIDIwMCAyMDAiIHZlcnNpb249IjEuMSIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIiB4bWxuczp4bGluaz0iaHR0cDovL3d3dy53My5vcmcvMTk5OS94bGluayI+DQogICAgPCEtLSBHZW5lcmF0b3I6IFNrZXRjaCAzLjguMyAoMjk4MDIpIC0gaHR0cDovL3d3dy5ib2hlbWlhbmNvZGluZy5jb20vc2tldGNoIC0tPg0KICAgIDx0aXRsZT52dWUtYWRtaW48L3RpdGxlPg0KICAgIDxkZXNjPkNyZWF0ZWQgd2l0aCBTa2V0Y2guPC9kZXNjPg0KICAgIDxkZWZzPg0KICAgICAgICA8cG9seWxpbmUgaWQ9InBhdGgtMSIgcG9pbnRzPSIyLjgzMzk3NjYzZS0xNCA2MS41ODYyNjM1IDE5OS43NjQyNzkgLTUuOTkwODkwNWUtMTUgMTcyLjU5MDM5MSAyMDAgMi44MzM5NzY2M2UtMTQgNjEuNTg2MjYzNSI+PC9wb2x5bGluZT4NCiAgICAgICAgPG1hc2sgaWQ9Im1hc2stMiIgbWFza0NvbnRlbnRVbml0cz0idXNlclNwYWNlT25Vc2UiIG1hc2tVbml0cz0ib2JqZWN0Qm91bmRpbmdCb3giIHg9IjAiIHk9IjAiIHdpZHRoPSIxOTkuNzY0Mjc5IiBoZWlnaHQ9IjIwMCIgZmlsbD0id2hpdGUiPg0KICAgICAgICAgICAgPHVzZSB4bGluazpocmVmPSIjcGF0aC0xIj48L3VzZT4NCiAgICAgICAgPC9tYXNrPg0KICAgICAgICA8cG9seWxpbmUgaWQ9InBhdGgtMyIgcG9pbnRzPSI4OC43NSAzNC4yMTQ1OTA4IDE5OS43MzAxNTUgMS40NzY4MTIzMWUtMTQgMTg0LjYzMzU1IDExMS4xMTExMTEgODguNzUgMzQuMjE0NTkwOCI+PC9wb2x5bGluZT4NCiAgICAgICAgPG1hc2sgaWQ9Im1hc2stNCIgbWFza0NvbnRlbnRVbml0cz0idXNlclNwYWNlT25Vc2UiIG1hc2tVbml0cz0ib2JqZWN0Qm91bmRpbmdCb3giIHg9IjAiIHk9IjAiIHdpZHRoPSIxMTAuOTgwMTU1IiBoZWlnaHQ9IjExMS4xMTExMTEiIGZpbGw9IndoaXRlIj4NCiAgICAgICAgICAgIDx1c2UgeGxpbms6aHJlZj0iI3BhdGgtMyI+PC91c2U+DQogICAgICAgIDwvbWFzaz4NCiAgICA8L2RlZnM+DQogICAgPGcgaWQ9IlBhZ2UtMSIgc3Ryb2tlPSJub25lIiBzdHJva2Utd2lkdGg9IjEiIGZpbGw9Im5vbmUiIGZpbGwtcnVsZT0iZXZlbm9kZCI+DQogICAgICAgIDxnIGlkPSJHcm91cCI+DQogICAgICAgICAgICA8cmVjdCBpZD0iUmVjdGFuZ2xlLTEiIHg9IjAiIHk9IjAiIHdpZHRoPSIyMDAiIGhlaWdodD0iMjAwIj48L3JlY3Q+DQogICAgICAgICAgICA8dXNlIGlkPSJUcmlhbmdsZS0xIiBzdHJva2U9IiM0MEI4ODMiIG1hc2s9InVybCgjbWFzay0yKSIgc3Ryb2tlLXdpZHRoPSI0MCIgeGxpbms6aHJlZj0iI3BhdGgtMSI+PC91c2U+DQogICAgICAgICAgICA8dXNlIGlkPSJUcmlhbmdsZS0xIiBzdHJva2U9IiMzNDQ5NUQiIG1hc2s9InVybCgjbWFzay00KSIgc3Ryb2tlLXdpZHRoPSI0MCIgeGxpbms6aHJlZj0iI3BhdGgtMyI+PC91c2U+DQogICAgICAgIDwvZz4NCiAgICA8L2c+DQo8L3N2Zz4=" alt="Vue Admin Panel Framework"></a> Login</h1>
				<div class="block">
					<p class="control has-icon">
						<input type="email" placeholder="Email" class="input">
						<span class="icon is-small">
							<i class="fa fa-envelope"></i>
						</span>
					</p>
					<p class="control has-icon">
						<input type="password" placeholder="Password" class="input">
						<span class="icon is-small">
							<i class="fa fa-lock"></i>
						</span>
					</p>
					<p class="control">
						<button class="button is-success" v-on:click="login()">Login</button>
					</p>
				</div>
			</article>
		</div>
	</div>
	</div>
	
	</div>
	
  </div>
</template>
<script>
import { Collapse, Item as CollapseItem } from 'vue-bulma-collapse'

export default {
  components: {
    Collapse,
    CollapseItem
  },
  created () {
    document.getElementById('baba').style.display = 'none'
  },
  methods: {
    login () {
      var elements = document.getElementsByClassName('app-sidebar')
      for
(var i = 0, length = elements.length; i < length; i++) {
        elements[i].style.display = 'block'
      }
      this.$auth.logout({
        redirect: 'Home',
        makeRequest: false
        // params: {},
        // success: function () {},
        // error: function () {},
        // etc...
      })
    }
  }
}

</script>
<style lang="scss">

.login-logo{
	width:25px;
	height:25px;
	padding-top:5px;
}
.login-form{
	padding-top:10%;
	padding-left:30%;
}
.login-box{
	width:350px;
}
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
parentElement > .app-sidebar {
  display:none;
}
</style>
