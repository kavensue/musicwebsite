<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>后台音乐管理</title>
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</head>

	<body>
		<h1>一午音乐管理</h1>

		<ul id="musicmanage" class="nav nav-tabs">
			<li class="active">
				<a href="#addmusic" data-toggle="tab">音乐添加</a>
			</li>
			<li>
				<a href="#findmusic" data-toggle="tab">音乐查询</a>
			</li>
		</ul>

		<div id="myTabContent" class="tab-content">
			<div class="tab-pane fade in active" id="addmusic">
				<form class="form-group" id="addmusicform" enctype="multipart/form-data">
					<p id="musicnamelabel">音乐名:</p>
					<input type="text" class="form-control" id="songname" placeholder="请输入歌曲名" />
					<p id="musictypelabel">音乐类型：</p>
					<input type="text" class="form-control" id="songtype" placeholder="请输入歌曲类型" />
					<p id="musicsingerlabel">歌手：</p>
					<input type="text" class="form-control" id="songsinger" placeholder="请输入歌手名" />
					<p id="musicalbumlabel">专辑：</p>
					<input type="text" class="form-control" id="songalbum" placeholder="请输入歌曲专辑" />
					<p id="musicfilelabel">音乐文件上传：</p>
					<input type="file" id="musicfile">
					<br />
					<button type="submit" class="btn btn-default">提交</button>
				</form>
			</div>

			<div class="tab-pane fade" id="findmusic">
				<form class="form-group" id="findmusicform">
					<p id="fingmusiclabel">音乐查询：</p>
					<input type="text" class="form-control" id="musickeyword" placeholder="请输入歌名或歌手名：" />
					<br />
					<button type="submit" class="btn btn-default">确定</button>
				</form>
			</div>
		</div>
	</body>

</html>