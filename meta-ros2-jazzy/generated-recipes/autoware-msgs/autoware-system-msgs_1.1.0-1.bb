# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "Autoware system messages package."
AUTHOR = "Takagi, Isamu <isamu.takagi@tier4.jp>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "autoware_msgs"
ROS_BPN = "autoware_system_msgs"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    diagnostic-msgs \
    geometry-msgs \
    nav-msgs \
    rosidl-default-generators \
    std-msgs \
    unique-identifier-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-auto-native \
"

ROS_EXPORT_DEPENDS = " \
    builtin-interfaces \
    diagnostic-msgs \
    geometry-msgs \
    nav-msgs \
    std-msgs \
    unique-identifier-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    diagnostic-msgs \
    geometry-msgs \
    nav-msgs \
    rosidl-default-runtime \
    std-msgs \
    unique-identifier-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/autoware_msgs-release/archive/release/jazzy/autoware_system_msgs/1.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/autoware_system_msgs"
SRC_URI = "git://github.com/ros2-gbp/autoware_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "96963a77d17c584973cd52f3e86f4b2c21b3272c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
