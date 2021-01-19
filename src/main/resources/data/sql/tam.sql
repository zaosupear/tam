sys_usergroup:
id bigint 用户组ID
usergroup_name varchar(50) 用户组名称
parent_id bigint 父用户组名称
create_by bigint 创建人ID
create_name varchar(30) 创建人
create_date datatime 创建时间
update_by bigint 更新人ID
update_name varchar(30) 更新人
update_date datatime 更新时间
deleted int 逻辑删除-旗标（1：删除 0：未删除）

sys_user_usergroup:
usergroup_id bigint 用户组ID
user_id bigint 用户ID

sys_user:
id bigint 用户ID
username varchar(30) 用户名
password varchar(50) 密码
mobilephone varchar(30) 手机号
email varchar(50) 邮箱
enabled int 账号是否可用（1：可用 0：不可用）
account_expired 账号是否过期（1：过期 0：未过期）
credentials_expired 凭证是否过期（1：过期 0：未过期）
account_locked 账号是否锁定（1：锁定 0：未锁定）
create_by bigint 创建人ID
create_name varchar(30) 创建人
create_date datatime 创建时间
update_by bigint 更新人ID
update_name varchar(30) 更新人
update_date datatime 更新时间
deleted int 逻辑删除-旗标（1：删除 0：未删除）

sys_user_role:
user_id bigint 用户ID
role_id bigint 角色ID

sys_usergroup_role:
usergroup_id bigint 用户组ID
role_id bigint 角色ID

sys_role:
id bigint 角色ID
role_code varchar(18) 角色编码
role_name varchar(50) 角色名
create_by bigint 创建人ID
create_name varchar(30) 创建人
create_date datatime 创建时间
update_by bigint 更新人ID
update_name varchar(30) 更新人
update_date datatime 更新时间
deleted int 逻辑删除-旗标（1：删除 0：未删除）

sys_role_privilege:
role_id bigint 角色ID
privilege_id bigint 权限ID

sys_privilege:
id bigint 权限ID
privilege_name varchar(50) 权限标识
create_by bigint 创建人ID
create_name varchar(30) 创建人
create_date datatime 创建时间
update_by bigint 更新人ID
update_name varchar(30) 更新人
update_date datatime 更新时间
deleted int 逻辑删除-旗标（1：删除 0：未删除）

